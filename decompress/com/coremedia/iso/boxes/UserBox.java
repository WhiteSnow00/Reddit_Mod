// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import pt2.b;
import ot2.a;
import com.googlecode.mp4parser.AbstractBox;

public class UserBox extends AbstractBox
{
    public static final String TYPE = "uuid";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    public byte[] data;
    
    static {
        ajc$preClinit();
    }
    
    public UserBox(final byte[] array) {
        super("uuid", array);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("UserBox.java", (Class)UserBox.class);
        ajc$tjp_0 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        ajc$tjp_2 = (a)b.f(b.e("setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"), 51);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        byteBuffer.get(this.data = new byte[byteBuffer.remaining()]);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }
    
    public long getContentSize() {
        return this.data.length;
    }
    
    public byte[] getData() {
        b.q(b.b(UserBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.data;
    }
    
    public void setData(final byte[] data) {
        b.q(b.c(UserBox.ajc$tjp_2, (Object)this, (Object)this, (Object)data));
        this.data = data;
    }
    
    public String toString() {
        final StringBuilder s = d.s(b.b(UserBox.ajc$tjp_0, (Object)this, (Object)this), "UserBox[type=");
        s.append(this.getType());
        s.append(";userType=");
        s.append(new String(this.getUserType()));
        s.append(";contentLength=");
        return al0.a.l(s, this.data.length, "]");
    }
}
