// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

import org.xml.sax.SAXException;

public class SVGParseException extends SAXException
{
    public SVGParseException(final String s) {
        super(s);
    }
    
    public SVGParseException(final String s, final Exception ex) {
        super(s, ex);
    }
}
