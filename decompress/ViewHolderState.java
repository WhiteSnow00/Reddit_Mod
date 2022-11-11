// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy;

import android.os.Parcelable$ClassLoaderCreator;
import android.util.SparseArray;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import X.04v;

public class ViewHolderState extends 04v<ViewState> implements Parcelable
{
    public static final Parcelable$Creator<ViewHolderState> CREATOR;
    
    static {
        Covode.recordClassIndex(2123);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ViewHolderState>() {
            static {
                Covode.recordClassIndex(2124);
            }
        };
    }
    
    public ViewHolderState() {
    }
    
    public ViewHolderState(final int n) {
        super(n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        final int liziz = this.LIZIZ();
        parcel.writeInt(liziz);
        for (i = 0; i < liziz; ++i) {
            parcel.writeLong(this.LIZIZ(i));
            parcel.writeParcelable((Parcelable)((04v<Parcelable>)this).LIZJ(i), 0);
        }
    }
    
    public static class ViewState extends SparseArray<Parcelable> implements Parcelable
    {
        public static final Parcelable$Creator<ViewState> CREATOR;
        
        static {
            Covode.recordClassIndex(2125);
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<ViewState>() {
                static {
                    Covode.recordClassIndex(2126);
                }
                
                private ViewState LIZ(final Parcel parcel, final ClassLoader classLoader) {
                    final int int1 = parcel.readInt();
                    final int[] array = new int[int1];
                    parcel.readIntArray(array);
                    return new ViewState(int1, array, parcel.readParcelableArray(classLoader), (byte)0);
                }
            };
        }
        
        public ViewState() {
        }
        
        public ViewState(final int n, final int[] array, final Parcelable[] array2) {
            super(n);
            for (int i = 0; i < n; ++i) {
                this.put(array[i], (Object)array2[i]);
            }
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            final int size = this.size();
            final int[] array = new int[size];
            final Parcelable[] array2 = new Parcelable[size];
            for (int i = 0; i < size; ++i) {
                array[i] = this.keyAt(i);
                array2[i] = (Parcelable)this.valueAt(i);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(array);
            parcel.writeParcelableArray(array2, n);
        }
    }
}
