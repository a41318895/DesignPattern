package com.aki.designPattern.structural.flyweight;

public class FlyWeightTest {

    public static void main(String[] args) {

        GlyphFactory glyphFactory = new GlyphFactory() ;

        Document document = new Document(glyphFactory) ;
        document.addGlyph('J', 0);
        document.addGlyph('A', 1);
        document.addGlyph('!', 5);
        document.addGlyph('V', 2);
        document.addGlyph('A', 3);

        document.displayGlyphs() ;
        document.formatOutput();
        document.formatOutputOptimization();
    }
}
