// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import n9.c;
import ej2.c0;
import java.nio.ByteBuffer;
import pt2.b;
import ot2.a;
import com.googlecode.mp4parser.AbstractBox;

public class OriginalFormatBox extends AbstractBox
{
    public static final String TYPE = "frma";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private String dataFormat;
    
    static {
        ajc$preClinit();
    }
    
    public OriginalFormatBox() {
        super("frma");
        this.dataFormat = "    ";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("OriginalFormatBox.java", (Class)OriginalFormatBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = (a)b.f(b.e("setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.dataFormat = c0.Q3(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(c.c(this.dataFormat));
    }
    
    public long getContentSize() {
        return 4L;
    }
    
    public String getDataFormat() {
        b.q(b.b(OriginalFormatBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.dataFormat;
    }
    
    public void setDataFormat(final String dataFormat) {
        b.q(b.c(OriginalFormatBox.ajc$tjp_1, (Object)this, (Object)this, (Object)dataFormat));
        this.dataFormat = dataFormat;
    }
    
    public String toString() {
        final StringBuilder s = d.s(b.b(OriginalFormatBox.ajc$tjp_2, (Object)this, (Object)this), "OriginalFormatBox[dataFormat=");
        s.append(this.getDataFormat());
        s.append("]");
        return s.toString();
    }
}
