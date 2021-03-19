package ru.job4j.tracker.exercises.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list;

    static class Builder {
        private List<Integer> list;

        public Builder buildList(List<Integer> list) {
            this.list = list;
            return this;
        }

        EasyStream build() {
            EasyStream es = new EasyStream();
            es.list = list;
            return es;
        }
    }

    public static EasyStream of(List<Integer> source) {
       return new Builder().buildList(source).build();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> buffer = new ArrayList<>();
        for (Integer i
                : list) {
            buffer.add(fun.apply(i));
        }
        return new Builder().buildList(buffer).build();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> buffer = new ArrayList<>();
        for (Integer i
                : list) {
            if (fun.test(i)) {
                buffer.add(i);
            }
        }
        return new Builder().buildList(buffer).build();
    }

    public List<Integer> collect() {
        return list;
    }
}
