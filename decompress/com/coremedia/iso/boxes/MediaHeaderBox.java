// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import mt2.c;
import com.googlecode.mp4parser.e;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.Date;
import lt2.a;
import ak.d;
import com.googlecode.mp4parser.AbstractFullBox;

public class MediaHeaderBox extends AbstractFullBox
{
    private static d LOG;
    public static final String TYPE = "mdhd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;
    
    static {
        ajc$preClinit();
        MediaHeaderBox.LOG = d.a((Class)MediaHeaderBox.class);
    }
    
    public MediaHeaderBox() {
        super("mdhd");
        this.creationTime = new Date();
        this.modificationTime = new Date();
        this.language = "eng";
    }
    
    private static void ajc$preClinit() {
        final b b = new b("MediaHeaderBox.java", (Class)MediaHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 48);
        ajc$tjp_1 = (a)b.f(b.e("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 52);
        ajc$tjp_10 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 125);
        ajc$tjp_2 = (a)b.f(b.e("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 56);
        ajc$tjp_3 = (a)b.f(b.e("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 60);
        ajc$tjp_4 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 64);
        ajc$tjp_5 = (a)b.f(b.e("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 81);
        ajc$tjp_6 = (a)b.f(b.e("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 85);
        ajc$tjp_7 = (a)b.f(b.e("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 89);
        ajc$tjp_8 = (a)b.f(b.e("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 93);
        ajc$tjp_9 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 97);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.creationTime = i10.a.m(xd.a.V0(byteBuffer));
            this.modificationTime = i10.a.m(xd.a.V0(byteBuffer));
            this.timescale = xd.a.U0(byteBuffer);
            this.duration = byteBuffer.getLong();
        }
        else {
            this.creationTime = i10.a.m(xd.a.U0(byteBuffer));
            this.modificationTime = i10.a.m(xd.a.U0(byteBuffer));
            this.timescale = xd.a.U0(byteBuffer);
            this.duration = xd.a.U0(byteBuffer);
        }
        if (this.duration < -1L) {
            MediaHeaderBox.LOG.d("mdhd duration is not in expected range");
        }
        this.language = xd.a.O0(byteBuffer);
        xd.a.S0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            byteBuffer.putLong(i10.a.l(this.creationTime));
            byteBuffer.putLong(i10.a.l(this.modificationTime));
            byteBuffer.putInt((int)this.timescale);
            byteBuffer.putLong(this.duration);
        }
        else {
            byteBuffer.putInt((int)i10.a.l(this.creationTime));
            byteBuffer.putInt((int)i10.a.l(this.modificationTime));
            byteBuffer.putInt((int)this.timescale);
            byteBuffer.putInt((int)this.duration);
        }
        if0.a.l0(this.language, byteBuffer);
        if0.a.m0(0, byteBuffer);
    }
    
    public long getContentSize() {
        long n;
        if (this.getVersion() == 1) {
            n = 32L;
        }
        else {
            n = 20L;
        }
        return n + 2L + 2L;
    }
    
    public Date getCreationTime() {
        m5.a.s(b.b(MediaHeaderBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.creationTime;
    }
    
    public long getDuration() {
        m5.a.s(b.b(MediaHeaderBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.duration;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(MediaHeaderBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.language;
    }
    
    public Date getModificationTime() {
        m5.a.s(b.b(MediaHeaderBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.modificationTime;
    }
    
    public long getTimescale() {
        m5.a.s(b.b(MediaHeaderBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.timescale;
    }
    
    public void setCreationTime(final Date creationTime) {
        m5.a.s(b.c(MediaHeaderBox.ajc$tjp_5, (Object)this, (Object)this, (Object)creationTime));
        this.creationTime = creationTime;
    }
    
    public void setDuration(final long duration) {
        m5.a.s(b.c(MediaHeaderBox.ajc$tjp_8, (Object)this, (Object)this, (Object)new Long(duration)));
        this.duration = duration;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(MediaHeaderBox.ajc$tjp_9, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setModificationTime(final Date modificationTime) {
        m5.a.s(b.c(MediaHeaderBox.ajc$tjp_6, (Object)this, (Object)this, (Object)modificationTime));
        this.modificationTime = modificationTime;
    }
    
    public void setTimescale(final long timescale) {
        m5.a.s(b.c(MediaHeaderBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Long(timescale)));
        this.timescale = timescale;
    }
    
    public String toString() {
        final c b = mt2.b.b(MediaHeaderBox.ajc$tjp_10, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaHeaderBox[");
        sb.append("creationTime=");
        sb.append(this.getCreationTime());
        sb.append(";");
        sb.append("modificationTime=");
        sb.append(this.getModificationTime());
        sb.append(";");
        sb.append("timescale=");
        sb.append(this.getTimescale());
        sb.append(";");
        sb.append("duration=");
        sb.append(this.getDuration());
        sb.append(";");
        sb.append("language=");
        sb.append(this.getLanguage());
        sb.append("]");
        return sb.toString();
    }
}
