// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import yt2.c;
import ak0.n;
import ng.f0;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import ck.e;
import java.util.Date;
import xt2.a;
import ck.d;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieHeaderBox extends AbstractFullBox
{
    private static d LOG;
    public static final String TYPE = "mvhd";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_10;
    private static final /* synthetic */ a ajc$tjp_11;
    private static final /* synthetic */ a ajc$tjp_12;
    private static final /* synthetic */ a ajc$tjp_13;
    private static final /* synthetic */ a ajc$tjp_14;
    private static final /* synthetic */ a ajc$tjp_15;
    private static final /* synthetic */ a ajc$tjp_16;
    private static final /* synthetic */ a ajc$tjp_17;
    private static final /* synthetic */ a ajc$tjp_18;
    private static final /* synthetic */ a ajc$tjp_19;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_20;
    private static final /* synthetic */ a ajc$tjp_21;
    private static final /* synthetic */ a ajc$tjp_22;
    private static final /* synthetic */ a ajc$tjp_23;
    private static final /* synthetic */ a ajc$tjp_24;
    private static final /* synthetic */ a ajc$tjp_25;
    private static final /* synthetic */ a ajc$tjp_26;
    private static final /* synthetic */ a ajc$tjp_27;
    private static final /* synthetic */ a ajc$tjp_28;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    private static final /* synthetic */ a ajc$tjp_7;
    private static final /* synthetic */ a ajc$tjp_8;
    private static final /* synthetic */ a ajc$tjp_9;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private e matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;
    
    static {
        ajc$preClinit();
        MovieHeaderBox.LOG = d.a((Class)MovieHeaderBox.class);
    }
    
    public MovieHeaderBox() {
        super("mvhd");
        this.rate = 1.0;
        this.volume = 1.0f;
        this.matrix = e.j;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("MovieHeaderBox.java", (Class)MovieHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 66);
        ajc$tjp_1 = (a)b.f(b.e("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 70);
        ajc$tjp_10 = (a)b.f(b.e("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 212);
        ajc$tjp_11 = (a)b.f(b.e("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 220);
        ajc$tjp_12 = (a)b.f(b.e("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 224);
        ajc$tjp_13 = (a)b.f(b.e("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 231);
        ajc$tjp_14 = (a)b.f(b.e("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 235);
        ajc$tjp_15 = (a)b.f(b.e("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 239);
        ajc$tjp_16 = (a)b.f(b.e("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 243);
        ajc$tjp_17 = (a)b.f(b.e("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 247);
        ajc$tjp_18 = (a)b.f(b.e("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 251);
        ajc$tjp_19 = (a)b.f(b.e("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 255);
        ajc$tjp_2 = (a)b.f(b.e("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 74);
        ajc$tjp_20 = (a)b.f(b.e("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 259);
        ajc$tjp_21 = (a)b.f(b.e("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 263);
        ajc$tjp_22 = (a)b.f(b.e("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 267);
        ajc$tjp_23 = (a)b.f(b.e("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 271);
        ajc$tjp_24 = (a)b.f(b.e("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 275);
        ajc$tjp_25 = (a)b.f(b.e("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 279);
        ajc$tjp_26 = (a)b.f(b.e("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 283);
        ajc$tjp_27 = (a)b.f(b.e("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 287);
        ajc$tjp_28 = (a)b.f(b.e("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 291);
        ajc$tjp_3 = (a)b.f(b.e("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 78);
        ajc$tjp_4 = (a)b.f(b.e("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 82);
        ajc$tjp_5 = (a)b.f(b.e("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 86);
        ajc$tjp_6 = (a)b.f(b.e("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 90);
        ajc$tjp_7 = (a)b.f(b.e("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 94);
        ajc$tjp_8 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 148);
        ajc$tjp_9 = (a)b.f(b.e("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 204);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.creationTime = f0.d2(c0.b0(byteBuffer));
            this.modificationTime = f0.d2(c0.b0(byteBuffer));
            this.timescale = c0.a0(byteBuffer);
            this.duration = byteBuffer.getLong();
        }
        else {
            this.creationTime = f0.d2(c0.a0(byteBuffer));
            this.modificationTime = f0.d2(c0.a0(byteBuffer));
            this.timescale = c0.a0(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1L) {
            MovieHeaderBox.LOG.d("mvhd duration is not in expected range");
        }
        this.rate = c0.S(byteBuffer);
        this.volume = c0.T(byteBuffer);
        c0.Y(byteBuffer);
        c0.a0(byteBuffer);
        c0.a0(byteBuffer);
        this.matrix = e.a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = c0.a0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            byteBuffer.putLong(f0.c2(this.creationTime));
            byteBuffer.putLong(f0.c2(this.modificationTime));
            byteBuffer.putInt((int)this.timescale);
            byteBuffer.putLong(this.duration);
        }
        else {
            byteBuffer.putInt((int)f0.c2(this.creationTime));
            byteBuffer.putInt((int)f0.c2(this.modificationTime));
            byteBuffer.putInt((int)this.timescale);
            byteBuffer.putInt((int)this.duration);
        }
        ah.a.j0(byteBuffer, this.rate);
        ah.a.k0(byteBuffer, (double)this.volume);
        ah.a.m0(0, byteBuffer);
        final int n = (int)0L;
        byteBuffer.putInt(n);
        byteBuffer.putInt(n);
        this.matrix.b(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        byteBuffer.putInt((int)this.nextTrackId);
    }
    
    public long getContentSize() {
        long n;
        if (this.getVersion() == 1) {
            n = 32L;
        }
        else {
            n = 20L;
        }
        return n + 80L;
    }
    
    public Date getCreationTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.creationTime;
    }
    
    public int getCurrentTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_27, (Object)this, (Object)this));
        return this.currentTime;
    }
    
    public long getDuration() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.duration;
    }
    
    public e getMatrix() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.matrix;
    }
    
    public Date getModificationTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.modificationTime;
    }
    
    public long getNextTrackId() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_7, (Object)this, (Object)this));
        return this.nextTrackId;
    }
    
    public int getPosterTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_21, (Object)this, (Object)this));
        return this.posterTime;
    }
    
    public int getPreviewDuration() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_19, (Object)this, (Object)this));
        return this.previewDuration;
    }
    
    public int getPreviewTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_17, (Object)this, (Object)this));
        return this.previewTime;
    }
    
    public double getRate() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.rate;
    }
    
    public int getSelectionDuration() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_25, (Object)this, (Object)this));
        return this.selectionDuration;
    }
    
    public int getSelectionTime() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_23, (Object)this, (Object)this));
        return this.selectionTime;
    }
    
    public long getTimescale() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.timescale;
    }
    
    public float getVolume() {
        n.x(b.b(MovieHeaderBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.volume;
    }
    
    public void setCreationTime(final Date creationTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_9, (Object)this, (Object)this, (Object)creationTime));
        this.creationTime = creationTime;
        if (f0.c2(creationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setCurrentTime(final int currentTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_28, (Object)this, (Object)this, (Object)new Integer(currentTime)));
        this.currentTime = currentTime;
    }
    
    public void setDuration(final long duration) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_12, (Object)this, (Object)this, (Object)new Long(duration)));
        this.duration = duration;
        if (duration >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setMatrix(final e matrix) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_15, (Object)this, (Object)this, (Object)matrix));
        this.matrix = matrix;
    }
    
    public void setModificationTime(final Date modificationTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_10, (Object)this, (Object)this, (Object)modificationTime));
        this.modificationTime = modificationTime;
        if (f0.c2(modificationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setNextTrackId(final long nextTrackId) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_16, (Object)this, (Object)this, (Object)new Long(nextTrackId)));
        this.nextTrackId = nextTrackId;
    }
    
    public void setPosterTime(final int posterTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_22, (Object)this, (Object)this, (Object)new Integer(posterTime)));
        this.posterTime = posterTime;
    }
    
    public void setPreviewDuration(final int previewDuration) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_20, (Object)this, (Object)this, (Object)new Integer(previewDuration)));
        this.previewDuration = previewDuration;
    }
    
    public void setPreviewTime(final int previewTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_18, (Object)this, (Object)this, (Object)new Integer(previewTime)));
        this.previewTime = previewTime;
    }
    
    public void setRate(final double rate) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_13, (Object)this, (Object)this, (Object)new Double(rate)));
        this.rate = rate;
    }
    
    public void setSelectionDuration(final int selectionDuration) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_26, (Object)this, (Object)this, (Object)new Integer(selectionDuration)));
        this.selectionDuration = selectionDuration;
    }
    
    public void setSelectionTime(final int selectionTime) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_24, (Object)this, (Object)this, (Object)new Integer(selectionTime)));
        this.selectionTime = selectionTime;
    }
    
    public void setTimescale(final long timescale) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_11, (Object)this, (Object)this, (Object)new Long(timescale)));
        this.timescale = timescale;
    }
    
    public void setVolume(final float volume) {
        n.x(b.c(MovieHeaderBox.ajc$tjp_14, (Object)this, (Object)this, (Object)new Float(volume)));
        this.volume = volume;
    }
    
    public String toString() {
        final c b = yt2.b.b(MovieHeaderBox.ajc$tjp_8, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("MovieHeaderBox[");
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
        sb.append("rate=");
        sb.append(this.getRate());
        sb.append(";");
        sb.append("volume=");
        sb.append(this.getVolume());
        sb.append(";");
        sb.append("matrix=");
        sb.append(this.matrix);
        sb.append(";");
        sb.append("nextTrackId=");
        sb.append(this.getNextTrackId());
        sb.append("]");
        return sb.toString();
    }
}
