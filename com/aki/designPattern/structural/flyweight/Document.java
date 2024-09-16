package com.aki.designPattern.structural.flyweight;

import java.util.*;

// Act as 外部狀態 ( Extrinsic State ) :
// Changed and non-shared part
public class Document {

    private final GlyphFactory glyphFactory ;
    private final Map<Integer, Glyph> positionsAndGlyphs = new HashMap<>();

    public Document(GlyphFactory glyphFactory) {
        this.glyphFactory = glyphFactory;
    }

    public void addGlyph(char character, int showPosition) {
        Glyph glyph = glyphFactory.getGlyph(character) ;
        positionsAndGlyphs.put(showPosition, glyph);
    }

    // Print the information of character position and corresponding Glyph
    public void displayGlyphs() {
        System.out.println("--- Document Displaying ---");

        for(Map.Entry<Integer, Glyph> entry : positionsAndGlyphs.entrySet()) {
            entry.getValue().display(entry.getKey());
        }
    }

    // Print the custom format of document entity
    public void formatOutput() {

        Glyph[] outputArray = new Glyph[Collections.max(positionsAndGlyphs.keySet()) + 1];

        List<Integer> positions = new ArrayList<>(positionsAndGlyphs.keySet());
        for(int position : positions) {
            outputArray[position] = positionsAndGlyphs.get(position) ;
        }

        StringBuilder output = new StringBuilder();
        for(Glyph glyph : outputArray) {
            if(glyph != null) {
                output.append(glyph);
            } else {
                output.append("[   ]");
            }
        }

        System.out.println(output);
    }

    public void formatOutputOptimization() {

        int maxPosition = Collections.max(positionsAndGlyphs.keySet());
        // Pre-allocate StringBuilder capacity and set the maximum capacity to avoid arranging too much memory
        StringBuilder output = new StringBuilder(Math.min((maxPosition + 1) * 5, 1000));

        for (int i = 0; i <= maxPosition; i++) {
            Glyph glyph = positionsAndGlyphs.get(i);
            if (glyph != null) {
                output.append(glyph);
            } else {
                output.append("[   ]");
            }
        }

        System.out.println(output);
    }
}
