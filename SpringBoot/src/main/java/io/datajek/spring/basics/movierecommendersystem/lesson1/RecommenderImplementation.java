package io.datajek.spring.basics.movierecommendersystem.lesson1.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        //return the results
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
