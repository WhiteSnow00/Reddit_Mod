// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.threegpp26244;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class LocationInformationBox extends AbstractFullBox
{
    public static final String TYPE = "loci";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_11;
    private static final a ajc$tjp_12;
    private static final a ajc$tjp_13;
    private static final a ajc$tjp_14;
    private static final a ajc$tjp_15;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;
    
    static {
        ajc$preClinit();
    }
    
    public LocationInformationBox() {
        super("loci");
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }
    
    private static void ajc$preClinit() {
        final b b = new b("LocationInformationBox.java", (Class)LocationInformationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = (a)b.f(b.e("getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = (a)b.f(b.e("setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = (a)b.f(b.e("getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = (a)b.f(b.e("setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = (a)b.f(b.e("getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = (a)b.f(b.e("setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = (a)b.f(b.e("getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = (a)b.f(b.e("setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = (a)b.f(b.e("getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = (a)b.f(b.e("setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = (a)b.f(b.e("getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = (a)b.f(b.e("setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = (a)b.f(b.e("getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = (a)b.f(b.e("setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.name = xd.a.Q0(byteBuffer);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.role = value;
        this.longitude = xd.a.M0(byteBuffer);
        this.latitude = xd.a.M0(byteBuffer);
        this.altitude = xd.a.M0(byteBuffer);
        this.astronomicalBody = xd.a.Q0(byteBuffer);
        this.additionalNotes = xd.a.Q0(byteBuffer);
    }
    
    public String getAdditionalNotes() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_14, (Object)this, (Object)this));
        return this.additionalNotes;
    }
    
    public double getAltitude() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_10, (Object)this, (Object)this));
        return this.altitude;
    }
    
    public String getAstronomicalBody() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_12, (Object)this, (Object)this));
        return this.astronomicalBody;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.name, byteBuffer, (byte)0);
        byteBuffer.put((byte)(this.role & 0xFF));
        if0.a.j0(byteBuffer, this.longitude);
        if0.a.j0(byteBuffer, this.latitude);
        if0.a.j0(byteBuffer, this.altitude);
        android.support.v4.media.a.D(this.astronomicalBody, byteBuffer, (byte)0);
        android.support.v4.media.a.D(this.additionalNotes, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.Z(this.name).length + 22 + l0.Z(this.astronomicalBody).length + l0.Z(this.additionalNotes).length;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public double getLatitude() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.latitude;
    }
    
    public double getLongitude() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.longitude;
    }
    
    public String getName() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.name;
    }
    
    public int getRole() {
        m5.a.s(b.b(LocationInformationBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.role;
    }
    
    public void setAdditionalNotes(final String additionalNotes) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_15, (Object)this, (Object)this, (Object)additionalNotes));
        this.additionalNotes = additionalNotes;
    }
    
    public void setAltitude(final double altitude) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_11, (Object)this, (Object)this, (Object)new Double(altitude)));
        this.altitude = altitude;
    }
    
    public void setAstronomicalBody(final String astronomicalBody) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_13, (Object)this, (Object)this, (Object)astronomicalBody));
        this.astronomicalBody = astronomicalBody;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setLatitude(final double latitude) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_9, (Object)this, (Object)this, (Object)new Double(latitude)));
        this.latitude = latitude;
    }
    
    public void setLongitude(final double longitude) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Double(longitude)));
        this.longitude = longitude;
    }
    
    public void setName(final String name) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_3, (Object)this, (Object)this, (Object)name));
        this.name = name;
    }
    
    public void setRole(final int role) {
        m5.a.s(b.c(LocationInformationBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(role)));
        this.role = role;
    }
}
