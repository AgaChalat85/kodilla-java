import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();

        String movies = booksTitlesWithTranslations.entrySet().stream()
                .map(map -> map.getValue())
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);

    }
}
