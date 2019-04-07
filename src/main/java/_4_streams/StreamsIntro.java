package _4_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.Apple.apples;

public class StreamsIntro {

    /**
     * Celem ćwiczenia było przedyskutowanie różnych sposobów na obsługę list w Javie;
     */
    public static void main(String[] args) {
        List<Apple> apples = apples();

        // Zaczęliśmy od przygotowania metody, która jest w stanie wybierać jabłka o podanym kolorze
        filterApplesByColor(apples, "red");

        // Następnie pojawiło się wymaganie, aby filtrować jabłka również po wadze. Jednym ze sposobów jest dopisanie nowej metody,
        // niestety powoduje to dużą duplikację kodu.
        filterApplesHeavierThan(apples, 300);

        // Aby poradzić sobie z problemem duplikacji wprowadzony został specjalny interfejs -> ApplePredicate.
        // Pozwala on na przekazanie do metody warunku, które dany obiekt typu Apple powinien spełnić.
        filterApples(apples, new RedApplePredicate());
        filterApples(apples, new HeavyApplePredicate());

        // Niestety to rozwiązanie również nie jest idealne - każde dodanie nowego warunku wymaga utworzenia nowej klasy
        // implementującej interfejs ApplePredicate. Aby tego uniknąć, możemy zamiast tego utworzyć klasę anonimową, która
        // również implementuje ten interfejs, ale tworzona jest w miejscu jej użycia (tzw. ad hoc)
        filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });

        // Ten sposób pozwala na dosyć swobodne i dynamiczne tworzenie warunków które dany Apple powinien spełniać. Ale sam
        // sposób zapisu jest mało wygodny. Można go uprościć wykorzystując wyrażenia lambda. Pozwalają one na pozbycie się nazwy
        // interfejsu (ponieważ wynika on z deklaracji metody filterApples) oraz nazwy metody, która jest overridowana (ponieważ
        // jest to jedyna metoda w tym interfejsie). Zapis po uproszczenie
        filterApples(apples, (Apple apple) -> {
                return apple.getColor().equals("red");
            }
        );

        // Znak '->' zwyczajowo rozdziela parametry metody od jej ciała (body). Zapis można uprościć jeszcze bardziej. Podobnie jak
        // Java jest w stanie wydedukować nazwę metody (ponieważ jest to jedyna metoda w interfejsie ApplePredicate, jest ona również
        // w stanie rozpoznać typ parametru, co sprawia że jest on nieobowiązkowy:
        filterApples(apples, apple -> {
                    return apple.getColor().equals("red");
                }
        );

        // Dodatkowo jeżeli lambda składa się tylko z jednej linijki możemu ominąć nawiasy klamrowe, słowo kluczowe return oraz średnik
        // sprowadzając zapis do następującej postaci:
        filterApples(apples, apple -> apple.getColor().equals("red"));

        // Z racji tego, że filtrowanie list jest bardzo powszechną operacją, możemy wykorzystać do tego zadanie Stream API,
        // czyli rozszerzenie kolekcji o możliwosć łatwego procesowania zbiorów danym.
        List<Juice> redApples = apples
                .stream() // utwórz stream z listy
                .filter(apple -> apple.getColor().equals("red")) // znajdź jabłka spełniające dany warunek
                .map(apple -> apple.makeJuice()) // transformacja obiektu na inny
                .collect(Collectors.toList()); // utwórz listę z elementów w streamie

        // Liczenie elementów, które pozostały w streamie
        long numberOfGreenApples = apples
                .stream() // utwórz stream z listy
                .filter(apple -> apple.getColor().equals("green")) // znajdź zielone jabłka
                .count(); // policz elementy w streamie
    }

    private static List<Apple> filterApplesByColor(List<Apple> apples, String color) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;
    }

    private static List<Apple> filterApplesHeavierThan(List<Apple> apples, Integer weight) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > 300) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;
    }

    private static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;
    }
}