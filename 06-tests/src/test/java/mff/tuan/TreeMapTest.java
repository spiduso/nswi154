package mff.tuan;

import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeMapTest {
    TreeMap<Integer, String> map;

    @BeforeEach
    public void setUp() {
        map = new TreeMap<>();

        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
    }

    @AfterEach
    public void tearDown() {
        map = null;
    }

    @Test
    public void addExistingKey() {
        map.put(1, "4");

        assertTrue(map.containsKey(1));
        assertEquals(map.size(), 3);
        assertEquals(map.get(1), "4");
    }

    @Test
    public void addUniqueKey() {
        map.put(4, "4");

        assertTrue(map.containsKey(4));
        assertEquals(map.get(4), "4");
        assertEquals(map.size(), 4);
    }

    @Test
    public void removeExistingMapping() {
        String removedValue = map.remove(1);
        assertEquals(removedValue, "1");
        assertNull(map.get(1));
        assertEquals(map.size(), 2);
    }

    @Test
    public void removeAllMappings() {
        map.remove(1);
        map.remove(2);
        map.remove(3);

        assertEquals(map.size(), 0);
        assertTrue(map.isEmpty());
    }

    @Test
    public void getMappingValue() {
        assertEquals(map.get(2), "2");
    }

    @Test
    public void getMappingKeyNotPresent() {
        assertNull(map.get(4));
    }

    @Test
    public void failKeyValueNotInMap(){
        assertEquals(map.get(4), "4");
    }
}

