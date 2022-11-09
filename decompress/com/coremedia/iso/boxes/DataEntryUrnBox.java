// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import ak0.m;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class DataEntryUrnBox extends AbstractFullBox
{
    public static final String TYPE = "urn ";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private String location;
    private String name;
    
    static {
        ajc$preClinit();
    }
    
    public DataEntryUrnBox() {
        super("urn ");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("DataEntryUrnBox.java", (Class)DataEntryUrnBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.name = c0.W(byteBuffer);
        this.location = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        m.A(this.name, byteBuffer, (byte)0);
        m.A(this.location, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.location) + (at1.a.m2(this.name) + 1) + 1;
    }
    
    public String getLocation() {
        n.x(b.b(DataEntryUrnBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.location;
    }
    
    public String getName() {
        n.x(b.b(DataEntryUrnBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.name;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(DataEntryUrnBox.ajc$tjp_2, (Object)this, (Object)this), "DataEntryUrlBox[name=");
        q.append(this.getName());
        q.append(";location=");
        q.append(this.getLocation());
        q.append("]");
        return q.toString();
    }
}
