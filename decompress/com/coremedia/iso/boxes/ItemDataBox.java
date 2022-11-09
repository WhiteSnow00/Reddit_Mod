// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import yt2.b;
import java.nio.ByteBuffer;
import xt2.a;
import com.googlecode.mp4parser.AbstractBox;

public class ItemDataBox extends AbstractBox
{
    public static final String TYPE = "idat";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    public ByteBuffer data;
    
    static {
        ajc$preClinit();
    }
    
    public ItemDataBox() {
        super("idat");
        this.data = ByteBuffer.allocate(0);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("ItemDataBox.java", (Class)ItemDataBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getData", "com.coremedia.iso.boxes.ItemDataBox", "", "", "", "java.nio.ByteBuffer"), 19);
        ajc$tjp_1 = (a)b.f(b.e("setData", "com.coremedia.iso.boxes.ItemDataBox", "java.nio.ByteBuffer", "data", "", "void"), 23);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }
    
    public long getContentSize() {
        return this.data.limit();
    }
    
    public ByteBuffer getData() {
        n.x(b.b(ItemDataBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.data;
    }
    
    public void setData(final ByteBuffer data) {
        n.x(b.c(ItemDataBox.ajc$tjp_1, (Object)this, (Object)this, (Object)data));
        this.data = data;
    }
}
