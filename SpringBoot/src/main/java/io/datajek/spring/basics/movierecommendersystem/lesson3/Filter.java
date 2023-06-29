package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

@Component
public interface Filter {
    public String[] getRecommendations(String movie);
}
