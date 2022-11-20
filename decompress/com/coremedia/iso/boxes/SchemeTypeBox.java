// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.e;
import dg.l0;
import o9.c;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SchemeTypeBox extends AbstractFullBox
{
    public static final boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    public String schemeType;
    public String schemeUri;
    public long schemeVersion;
    
    static {
        ajc$preClinit();
    }
    
    public SchemeTypeBox() {
        super("schm");
        this.schemeType = "    ";
        this.schemeUri = null;
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SchemeTypeBox.java", (Class)SchemeTypeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = (a)b.f(b.e("getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = (a)b.f(b.e("getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = (a)b.f(b.e("setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = (a)b.f(b.e("setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = (a)b.f(b.e("setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.schemeType = xd.a.J0(byteBuffer);
        this.schemeVersion = xd.a.U0(byteBuffer);
        if ((this.getFlags() & 0x1) == 0x1) {
            this.schemeUri = xd.a.Q0(byteBuffer);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(c.d(this.schemeType));
        byteBuffer.putInt((int)this.schemeVersion);
        if ((this.getFlags() & 0x1) == 0x1) {
            byteBuffer.put(l0.Z(this.schemeUri));
        }
    }
    
    public long getContentSize() {
        int n;
        if ((this.getFlags() & 0x1) == 0x1) {
            n = l0.s1(this.schemeUri) + 1;
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public String getSchemeType() {
        m5.a.s(b.b(SchemeTypeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.schemeType;
    }
    
    public String getSchemeUri() {
        m5.a.s(b.b(SchemeTypeBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.schemeUri;
    }
    
    public long getSchemeVersion() {
        m5.a.s(b.b(SchemeTypeBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.schemeVersion;
    }
    
    public void setSchemeType(final String schemeType) {
        m5.a.s(b.c(SchemeTypeBox.ajc$tjp_3, (Object)this, (Object)this, (Object)schemeType));
        this.schemeType = schemeType;
    }
    
    public void setSchemeUri(final String schemeUri) {
        m5.a.s(b.c(SchemeTypeBox.ajc$tjp_5, (Object)this, (Object)this, (Object)schemeUri));
        this.schemeUri = schemeUri;
    }
    
    public void setSchemeVersion(final int n) {
        m5.a.s(b.c(SchemeTypeBox.ajc$tjp_4, (Object)this, (Object)this, (Object)new Integer(n)));
        this.schemeVersion = n;
    }
    
    public String toString() {
        final mt2.c b = mt2.b.b(SchemeTypeBox.ajc$tjp_6, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("Schema Type Box[");
        sb.append("schemeUri=");
        m5.a.r(sb, this.schemeUri, "; ", "schemeType=");
        m5.a.r(sb, this.schemeType, "; ", "schemeVersion=");
        sb.append(this.schemeVersion);
        sb.append("; ");
        sb.append("]");
        return sb.toString();
    }
}
