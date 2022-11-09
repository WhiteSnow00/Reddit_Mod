// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class DataEntryUrlBox extends AbstractFullBox
{
    public static final String TYPE = "url ";
    private static final /* synthetic */ a ajc$tjp_0;
    
    static {
        ajc$preClinit();
    }
    
    public DataEntryUrlBox() {
        super("url ");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
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
        n.x(b.b(DataEntryUrlBox.ajc$tjp_0, (Object)this, (Object)this));
        return "DataEntryUrlBox[]";
    }
}
