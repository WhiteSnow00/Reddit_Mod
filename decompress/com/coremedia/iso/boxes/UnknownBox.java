// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import yt2.c;
import com.googlecode.mp4parser.e;
import ak0.n;
import yt2.b;
import java.nio.ByteBuffer;
import xt2.a;
import com.googlecode.mp4parser.AbstractBox;

public class UnknownBox extends AbstractBox
{
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    public ByteBuffer data;
    
    static {
        ajc$preClinit();
    }
    
    public UnknownBox(final String s) {
        super(s);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("UnknownBox.java", (Class)UnknownBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        ajc$tjp_1 = (a)b.f(b.e("setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.lang.String"), 61);
    }
    
    public void _parseDetails(final ByteBuffer data) {
        (this.data = data).position(data.remaining() + data.position());
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }
    
    public long getContentSize() {
        return this.data.limit();
    }
    
    public ByteBuffer getData() {
        n.x(b.b(UnknownBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.data;
    }
    
    public void setData(final ByteBuffer data) {
        n.x(b.c(UnknownBox.ajc$tjp_1, (Object)this, (Object)this, (Object)data));
        this.data = data;
    }
    
    public String toString() {
        final c b = yt2.b.b(UnknownBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder(this.getClass().getName());
        sb.append("[");
        sb.append(this.getType());
        sb.append("]@");
        sb.append(Integer.toHexString(this.hashCode()));
        return sb.toString();
    }
}
