// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class DataEntryUrlBox extends AbstractFullBox
{
    public static final String TYPE = "url ";
    private static final a ajc$tjp_0;
    
    static {
        ajc$preClinit();
    }
    
    public DataEntryUrlBox() {
        super("url ");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("DataEntryUrlBox.java", (Class)DataEntryUrlBox.class);
        ajc$tjp_0 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
    }
    
    public long getContentSize() {
        return 4L;
    }
    
    public String toString() {
        m5.a.s(b.b(DataEntryUrlBox.ajc$tjp_0, (Object)this, (Object)this));
        return "DataEntryUrlBox[]";
    }
}
