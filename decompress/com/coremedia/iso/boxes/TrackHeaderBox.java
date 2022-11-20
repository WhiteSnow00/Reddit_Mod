// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import mt2.c;
import java.nio.ByteBuffer;
import mt2.b;
import ak.e;
import java.util.Date;
import lt2.a;
import ak.d;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackHeaderBox extends AbstractFullBox
{
    private static d LOG;
    public static final String TYPE = "tkhd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_11;
    private static final a ajc$tjp_12;
    private static final a ajc$tjp_13;
    private static final a ajc$tjp_14;
    private static final a ajc$tjp_15;
    private static final a ajc$tjp_16;
    private static final a ajc$tjp_17;
    private static final a ajc$tjp_18;
    private static final a ajc$tjp_19;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_20;
    private static final a ajc$tjp_21;
    private static final a ajc$tjp_22;
    private static final a ajc$tjp_23;
    private static final a ajc$tjp_24;
    private static final a ajc$tjp_25;
    private static final a ajc$tjp_26;
    private static final a ajc$tjp_27;
    private static final a ajc$tjp_28;
    private static final a ajc$tjp_29;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private e matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;
    
    static {
        ajc$preClinit();
        TrackHeaderBox.LOG = d.a((Class)TrackHeaderBox.class);
    }
    
    public TrackHeaderBox() {
        super("tkhd");
        this.creationTime = new Date(0L);
        this.modificationTime = new Date(0L);
        this.matrix = e.j;
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackHeaderBox.java", (Class)TrackHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 62);
        ajc$tjp_1 = (a)b.f(b.e("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 66);
        ajc$tjp_10 = (a)b.f(b.e("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 145);
        ajc$tjp_11 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 173);
        ajc$tjp_12 = (a)b.f(b.e("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 199);
        ajc$tjp_13 = (a)b.f(b.e("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 206);
        ajc$tjp_14 = (a)b.f(b.e("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 214);
        ajc$tjp_15 = (a)b.f(b.e("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 218);
        ajc$tjp_16 = (a)b.f(b.e("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 225);
        ajc$tjp_17 = (a)b.f(b.e("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 229);
        ajc$tjp_18 = (a)b.f(b.e("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 233);
        ajc$tjp_19 = (a)b.f(b.e("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 237);
        ajc$tjp_2 = (a)b.f(b.e("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 70);
        ajc$tjp_20 = (a)b.f(b.e("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 241);
        ajc$tjp_21 = (a)b.f(b.e("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 245);
        ajc$tjp_22 = (a)b.f(b.e("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 250);
        ajc$tjp_23 = (a)b.f(b.e("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 254);
        ajc$tjp_24 = (a)b.f(b.e("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 258);
        ajc$tjp_25 = (a)b.f(b.e("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 262);
        ajc$tjp_26 = (a)b.f(b.e("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 266);
        ajc$tjp_27 = (a)b.f(b.e("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 274);
        ajc$tjp_28 = (a)b.f(b.e("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 282);
        ajc$tjp_29 = (a)b.f(b.e("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 290);
        ajc$tjp_3 = (a)b.f(b.e("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 74);
        ajc$tjp_4 = (a)b.f(b.e("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 78);
        ajc$tjp_5 = (a)b.f(b.e("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 82);
        ajc$tjp_6 = (a)b.f(b.e("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 86);
        ajc$tjp_7 = (a)b.f(b.e("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 90);
        ajc$tjp_8 = (a)b.f(b.e("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 94);
        ajc$tjp_9 = (a)b.f(b.e("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 98);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.creationTime = i10.a.m(xd.a.V0(byteBuffer));
            this.modificationTime = i10.a.m(xd.a.V0(byteBuffer));
            this.trackId = xd.a.U0(byteBuffer);
            xd.a.U0(byteBuffer);
            this.duration = byteBuffer.getLong();
        }
        else {
            this.creationTime = i10.a.m(xd.a.U0(byteBuffer));
            this.modificationTime = i10.a.m(xd.a.U0(byteBuffer));
            this.trackId = xd.a.U0(byteBuffer);
            xd.a.U0(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1L) {
            TrackHeaderBox.LOG.d("tkhd duration is not in expected range");
        }
        xd.a.U0(byteBuffer);
        xd.a.U0(byteBuffer);
        this.layer = xd.a.S0(byteBuffer);
        this.alternateGroup = xd.a.S0(byteBuffer);
        this.volume = xd.a.N0(byteBuffer);
        xd.a.S0(byteBuffer);
        this.matrix = e.a(byteBuffer);
        this.width = xd.a.M0(byteBuffer);
        this.height = xd.a.M0(byteBuffer);
    }
    
    public int getAlternateGroup() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.alternateGroup;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        final c c = b.c(TrackHeaderBox.ajc$tjp_10, (Object)this, (Object)this, (Object)byteBuffer);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(c);
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            byteBuffer.putLong(i10.a.l(this.creationTime));
            byteBuffer.putLong(i10.a.l(this.modificationTime));
            byteBuffer.putInt((int)this.trackId);
            byteBuffer.putInt((int)0L);
            byteBuffer.putLong(this.duration);
        }
        else {
            byteBuffer.putInt((int)i10.a.l(this.creationTime));
            byteBuffer.putInt((int)i10.a.l(this.modificationTime));
            byteBuffer.putInt((int)this.trackId);
            byteBuffer.putInt((int)0L);
            byteBuffer.putInt((int)this.duration);
        }
        final int n = (int)0L;
        byteBuffer.putInt(n);
        byteBuffer.putInt(n);
        if0.a.m0(this.layer, byteBuffer);
        if0.a.m0(this.alternateGroup, byteBuffer);
        if0.a.k0(byteBuffer, (double)this.volume);
        if0.a.m0(0, byteBuffer);
        this.matrix.b(byteBuffer);
        if0.a.j0(byteBuffer, this.width);
        if0.a.j0(byteBuffer, this.height);
    }
    
    public long getContentSize() {
        long n;
        if (this.getVersion() == 1) {
            n = 36L;
        }
        else {
            n = 24L;
        }
        return n + 60L;
    }
    
    public Date getCreationTime() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.creationTime;
    }
    
    public long getDuration() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.duration;
    }
    
    public double getHeight() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_9, (Object)this, (Object)this));
        return this.height;
    }
    
    public int getLayer() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.layer;
    }
    
    public e getMatrix() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_7, (Object)this, (Object)this));
        return this.matrix;
    }
    
    public Date getModificationTime() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.modificationTime;
    }
    
    public long getTrackId() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.trackId;
    }
    
    public float getVolume() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.volume;
    }
    
    public double getWidth() {
        m5.a.s(b.b(TrackHeaderBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.width;
    }
    
    public boolean isEnabled() {
        final c b = mt2.b.b(TrackHeaderBox.ajc$tjp_22, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        return (this.getFlags() & 0x1) > 0;
    }
    
    public boolean isInMovie() {
        final c b = mt2.b.b(TrackHeaderBox.ajc$tjp_23, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        return (this.getFlags() & 0x2) > 0;
    }
    
    public boolean isInPoster() {
        final c b = mt2.b.b(TrackHeaderBox.ajc$tjp_25, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        return (this.getFlags() & 0x8) > 0;
    }
    
    public boolean isInPreview() {
        final c b = mt2.b.b(TrackHeaderBox.ajc$tjp_24, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        return (this.getFlags() & 0x4) > 0;
    }
    
    public void setAlternateGroup(final int alternateGroup) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_17, (Object)this, (Object)this, (Object)new Integer(alternateGroup)));
        this.alternateGroup = alternateGroup;
    }
    
    public void setCreationTime(final Date creationTime) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_12, (Object)this, (Object)this, (Object)creationTime));
        this.creationTime = creationTime;
        if (i10.a.l(creationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setDuration(final long duration) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_15, (Object)this, (Object)this, (Object)new Long(duration)));
        this.duration = duration;
        if (duration >= 4294967296L) {
            this.setFlags(1);
        }
    }
    
    public void setEnabled(final boolean b) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_26, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x1);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFFFFE);
        }
    }
    
    public void setHeight(final double height) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_21, (Object)this, (Object)this, (Object)new Double(height)));
        this.height = height;
    }
    
    public void setInMovie(final boolean b) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_27, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x2);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFFFFD);
        }
    }
    
    public void setInPoster(final boolean b) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_29, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x8);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFFFF7);
        }
    }
    
    public void setInPreview(final boolean b) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_28, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x4);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFFFFB);
        }
    }
    
    public void setLayer(final int layer) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_16, (Object)this, (Object)this, (Object)new Integer(layer)));
        this.layer = layer;
    }
    
    public void setMatrix(final e matrix) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_19, (Object)this, (Object)this, (Object)matrix));
        this.matrix = matrix;
    }
    
    public void setModificationTime(final Date modificationTime) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_13, (Object)this, (Object)this, (Object)modificationTime));
        this.modificationTime = modificationTime;
        if (i10.a.l(modificationTime) >= 4294967296L) {
            this.setVersion(1);
        }
    }
    
    public void setTrackId(final long trackId) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_14, (Object)this, (Object)this, (Object)new Long(trackId)));
        this.trackId = trackId;
    }
    
    public void setVolume(final float volume) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_18, (Object)this, (Object)this, (Object)new Float(volume)));
        this.volume = volume;
    }
    
    public void setWidth(final double width) {
        m5.a.s(b.c(TrackHeaderBox.ajc$tjp_20, (Object)this, (Object)this, (Object)new Double(width)));
        this.width = width;
    }
    
    public String toString() {
        final c b = mt2.b.b(TrackHeaderBox.ajc$tjp_11, (Object)this, (Object)this);
        com.googlecode.mp4parser.e.a().getClass();
        com.googlecode.mp4parser.e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackHeaderBox[");
        sb.append("creationTime=");
        sb.append(this.getCreationTime());
        sb.append(";");
        sb.append("modificationTime=");
        sb.append(this.getModificationTime());
        sb.append(";");
        sb.append("trackId=");
        sb.append(this.getTrackId());
        sb.append(";");
        sb.append("duration=");
        sb.append(this.getDuration());
        sb.append(";");
        sb.append("layer=");
        sb.append(this.getLayer());
        sb.append(";");
        sb.append("alternateGroup=");
        sb.append(this.getAlternateGroup());
        sb.append(";");
        sb.append("volume=");
        sb.append(this.getVolume());
        sb.append(";");
        sb.append("matrix=");
        sb.append(this.matrix);
        sb.append(";");
        sb.append("width=");
        sb.append(this.getWidth());
        sb.append(";");
        sb.append("height=");
        sb.append(this.getHeight());
        sb.append("]");
        return sb.toString();
    }
}
