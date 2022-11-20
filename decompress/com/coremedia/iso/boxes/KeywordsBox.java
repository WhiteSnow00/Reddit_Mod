// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import mt2.c;
import com.googlecode.mp4parser.e;
import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class KeywordsBox extends AbstractFullBox
{
    public static final String TYPE = "kywd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private String[] keywords;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public KeywordsBox() {
        super("kywd");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("KeywordsBox.java", (Class)KeywordsBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        ajc$tjp_3 = (a)b.f(b.e("setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.keywords = new String[value];
        for (int i = 0; i < value; ++i) {
            byteBuffer.get();
            this.keywords[i] = xd.a.Q0(byteBuffer);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        byteBuffer.put((byte)(this.keywords.length & 0xFF));
        for (final String s : this.keywords) {
            byteBuffer.put((byte)(l0.s1(s) + 1 & 0xFF));
            byteBuffer.put(l0.Z(s));
        }
    }
    
    public long getContentSize() {
        final String[] keywords = this.keywords;
        final int length = keywords.length;
        long n = 7L;
        for (int i = 0; i < length; ++i) {
            n += l0.s1(keywords[i]) + 1 + 1;
        }
        return n;
    }
    
    public String[] getKeywords() {
        m5.a.s(b.b(KeywordsBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.keywords;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(KeywordsBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setKeywords(final String[] keywords) {
        m5.a.s(b.c(KeywordsBox.ajc$tjp_3, (Object)this, (Object)this, (Object)keywords));
        this.keywords = keywords;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(KeywordsBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final c b = mt2.b.b(KeywordsBox.ajc$tjp_4, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuffer sb = new StringBuffer();
        sb.append("KeywordsBox[language=");
        sb.append(this.getLanguage());
        for (int i = 0; i < this.keywords.length; ++i) {
            sb.append(";keyword");
            sb.append(i);
            sb.append("=");
            sb.append(this.keywords[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
