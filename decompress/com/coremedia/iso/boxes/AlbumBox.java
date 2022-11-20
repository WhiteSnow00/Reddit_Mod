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

public class AlbumBox extends AbstractFullBox
{
    public static final String TYPE = "albm";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private String albumTitle;
    private String language;
    private int trackNumber;
    
    static {
        ajc$preClinit();
    }
    
    public AlbumBox() {
        super("albm");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("AlbumBox.java", (Class)AlbumBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = (a)b.f(b.e("getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = (a)b.f(b.e("getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        ajc$tjp_4 = (a)b.f(b.e("setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = (a)b.f(b.e("setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.albumTitle = xd.a.Q0(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            final byte value = byteBuffer.get();
            int trackNumber;
            if ((trackNumber = value) < 0) {
                trackNumber = value + 256;
            }
            this.trackNumber = trackNumber;
        }
        else {
            this.trackNumber = -1;
        }
    }
    
    public String getAlbumTitle() {
        m5.a.s(b.b(AlbumBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.albumTitle;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.albumTitle, byteBuffer, (byte)0);
        final int trackNumber = this.trackNumber;
        if (trackNumber != -1) {
            byteBuffer.put((byte)(trackNumber & 0xFF));
        }
    }
    
    public long getContentSize() {
        final int s1 = l0.s1(this.albumTitle);
        int n = 1;
        if (this.trackNumber == -1) {
            n = 0;
        }
        return s1 + 6 + 1 + n;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(AlbumBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public int getTrackNumber() {
        m5.a.s(b.b(AlbumBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.trackNumber;
    }
    
    public void setAlbumTitle(final String albumTitle) {
        m5.a.s(b.c(AlbumBox.ajc$tjp_4, (Object)this, (Object)this, (Object)albumTitle));
        this.albumTitle = albumTitle;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(AlbumBox.ajc$tjp_3, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setTrackNumber(final int trackNumber) {
        m5.a.s(b.c(AlbumBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(trackNumber)));
        this.trackNumber = trackNumber;
    }
    
    public String toString() {
        final c b = mt2.b.b(AlbumBox.ajc$tjp_6, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("AlbumBox[language=");
        sb.append(this.getLanguage());
        sb.append(";");
        sb.append("albumTitle=");
        sb.append(this.getAlbumTitle());
        if (this.trackNumber >= 0) {
            sb.append(";trackNumber=");
            sb.append(this.getTrackNumber());
        }
        sb.append("]");
        return sb.toString();
    }
}
