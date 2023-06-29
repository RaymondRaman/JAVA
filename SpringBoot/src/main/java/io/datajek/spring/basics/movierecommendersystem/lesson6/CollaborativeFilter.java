package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CF")
public class CollaborativeFilter implements Filter{
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
