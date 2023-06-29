package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("contentBasedFilter")Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
