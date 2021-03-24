package com.something;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SomeTest {
    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private SomeRepository someRepository;

    @Test
    void test() {
        ChildEntity child1 = childRepository.save(new ChildEntity("1"));
        ChildEntity child2 = childRepository.save(new ChildEntity("2"));
        ChildEntity child3 = childRepository.save(new ChildEntity("3"));
        SomeEntity threeChildren = someRepository.save(new SomeEntity(List.of(child1, child2, child3)));
        threeChildren.children.remove(0);

        // should not throw exception
        someRepository.save(threeChildren);
    }

}