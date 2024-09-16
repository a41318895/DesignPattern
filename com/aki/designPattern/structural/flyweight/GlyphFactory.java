package com.aki.designPattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Creating and manage the shared Glyph objects.
public class GlyphFactory {

    private final Map<Character, Glyph> glyphs = new HashMap<>();

    public Glyph getGlyph(char character) {

        // If map doesn't have the key-value pair of indicated key or the value is null,
        // compute the new value to put to map.Otherwise, return the corresponding value.
        return glyphs.computeIfAbsent(character, Glyph::new) ;
    }
}
