// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.io.input;

import java.io.IOException;

public class XmlStreamReaderException extends IOException
{
    private static final long serialVersionUID = 1L;
    private final String bomEncoding;
    private final String contentTypeEncoding;
    private final String contentTypeMime;
    private final String xmlEncoding;
    private final String xmlGuessEncoding;
    
    public XmlStreamReaderException(final String s, final String s2, final String s3, final String s4) {
        this(s, null, null, s2, s3, s4);
    }
    
    public XmlStreamReaderException(final String s, final String contentTypeMime, final String contentTypeEncoding, final String bomEncoding, final String xmlGuessEncoding, final String xmlEncoding) {
        super(s);
        this.contentTypeMime = contentTypeMime;
        this.contentTypeEncoding = contentTypeEncoding;
        this.bomEncoding = bomEncoding;
        this.xmlGuessEncoding = xmlGuessEncoding;
        this.xmlEncoding = xmlEncoding;
    }
    
    public String getBomEncoding() {
        return this.bomEncoding;
    }
    
    public String getContentTypeEncoding() {
        return this.contentTypeEncoding;
    }
    
    public String getContentTypeMime() {
        return this.contentTypeMime;
    }
    
    public String getXmlEncoding() {
        return this.xmlEncoding;
    }
    
    public String getXmlGuessEncoding() {
        return this.xmlGuessEncoding;
    }
}
