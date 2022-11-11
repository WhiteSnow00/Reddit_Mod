// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.emoji;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.a.c;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import X.1F8;

public class EmoteModel extends 1F8 implements Parcelable
{
    public static final Parcelable$Creator<EmoteModel> CREATOR;
    @c(LIZ = "emote_id")
    public String LJFF;
    @c(LIZ = "image")
    public ImageModel LJI;
    @c(LIZ = "audit_status")
    public int LJII;
    @c(LIZ = "uuid")
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public transient Drawable LJIIL;
    
    static {
        Covode.recordClassIndex(4922);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<EmoteModel>() {
            static {
                Covode.recordClassIndex(4923);
            }
        };
    }
    
    public EmoteModel() {
        this.LJIIJ = true;
    }
    
    public EmoteModel(final Parcel parcel) {
        final boolean b = true;
        this.LJIIJ = true;
        this.LJFF = parcel.readString();
        this.LJI = (ImageModel)parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readString();
        this.LJIIJ = (parcel.readByte() != 0);
        this.LJIIJJI = (parcel.readByte() != 0 && b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.LJFF);
        parcel.writeParcelable((Parcelable)this.LJI, n);
        parcel.writeInt(this.LJII);
        parcel.writeString(this.LJIIIIZZ);
        parcel.writeByte((byte)(byte)(this.LJIIJ ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.LJIIJJI ? 1 : 0));
    }
}
