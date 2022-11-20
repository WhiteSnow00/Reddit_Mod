// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class DataEntryUrnBox extends AbstractFullBox
{
    public static final String TYPE = "urn ";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private String location;
    private String name;
    
    static {
        ajc$preClinit();
    }
    
    public DataEntryUrnBox() {
        super("urn ");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("DataEntryUrnBox.java", (Class)DataEntryUrnBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.name = xd.a.Q0(byteBuffer);
        this.location = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        android.support.v4.media.a.D(this.name, byteBuffer, (byte)0);
        android.support.v4.media.a.D(this.location, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.location) + (l0.s1(this.name) + 1) + 1;
    }
    
    public String getLocation() {
        m5.a.s(b.b(DataEntryUrnBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.location;
    }
    
    public String getName() {
        m5.a.s(b.b(DataEntryUrnBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.name;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(DataEntryUrnBox.ajc$tjp_2, (Object)this, (Object)this), "DataEntryUrlBox[name=");
        p.append(this.getName());
        p.append(";location=");
        p.append(this.getLocation());
        p.append("]");
        return p.toString();
    }
}
