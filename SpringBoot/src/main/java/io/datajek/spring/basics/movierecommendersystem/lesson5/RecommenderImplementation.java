package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter contentBasedFilter;
    // private Filter collaborativeFilter;

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }
}
