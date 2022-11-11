// 
// Decompiled by Procyon v0.6.0
// 

package bytedance.io;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class BdMediaItem implements Parcelable
{
    public static final Parcelable$Creator<BdMediaItem> CREATOR;
    public long LIZ;
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public Uri LJIIJ;
    public String LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public String LJIJJ;
    
    static {
        Covode.recordClassIndex(1814);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<BdMediaItem>() {
            static {
                Covode.recordClassIndex(1815);
            }
        };
    }
    
    public BdMediaItem() {
    }
    
    public BdMediaItem(final Parcel parcel) {
        this.LIZ = parcel.readLong();
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readLong();
        this.LJ = parcel.readString();
        this.LJFF = parcel.readLong();
        this.LJI = parcel.readLong();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readInt();
        this.LJIIIZ = parcel.readInt();
        this.LJIIJ = (Uri)parcel.readParcelable(Uri.class.getClassLoader());
        this.LJIIJJI = parcel.readString();
        this.LJIIL = parcel.readLong();
        this.LJIILIIL = parcel.readInt();
        this.LJIILJJIL = parcel.readString();
        this.LJIILL = parcel.readString();
        this.LJIILLIIL = parcel.readString();
        this.LJIIZILJ = parcel.readString();
        this.LJIJ = parcel.readLong();
        this.LJIJI = parcel.readLong();
        this.LJIJJ = parcel.readString();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BdMediaItem{id=");
        sb.append(this.LIZ);
        sb.append(", name='");
        sb.append(this.LIZIZ);
        sb.append('\'');
        sb.append(", modify=");
        sb.append(this.LIZJ);
        sb.append(", dateAdded=");
        sb.append(this.LIZLLL);
        sb.append(", mimeType='");
        sb.append(this.LJ);
        sb.append('\'');
        sb.append(", duration=");
        sb.append(this.LJFF);
        sb.append(", fileSize=");
        sb.append(this.LJI);
        sb.append(", width=");
        sb.append(this.LJII);
        sb.append(", height=");
        sb.append(this.LJIIIIZZ);
        sb.append(", musicType=");
        sb.append(this.LJIIIZ);
        sb.append(", uri=");
        sb.append(this.LJIIJ);
        sb.append(", relativePath='");
        sb.append(this.LJIIJJI);
        sb.append('\'');
        sb.append(", dateToken=");
        sb.append(this.LJIIL);
        sb.append(", orientation=");
        sb.append(this.LJIILIIL);
        sb.append(", resolution='");
        sb.append(this.LJIILJJIL);
        sb.append('\'');
        sb.append(", album='");
        sb.append(this.LJIILL);
        sb.append('\'');
        sb.append(", artist='");
        sb.append(this.LJIILLIIL);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.LJIIZILJ);
        sb.append('\'');
        sb.append(", albumId=");
        sb.append(this.LJIJ);
        sb.append(", bucketId=");
        sb.append(this.LJIJI);
        sb.append(", bucketName=");
        sb.append(this.LJIJJ);
        sb.append('}');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.LIZ);
        parcel.writeString(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeLong(this.LIZLLL);
        parcel.writeString(this.LJ);
        parcel.writeLong(this.LJFF);
        parcel.writeLong(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeInt(this.LJIIIIZZ);
        parcel.writeInt(this.LJIIIZ);
        parcel.writeParcelable((Parcelable)this.LJIIJ, n);
        parcel.writeString(this.LJIIJJI);
        parcel.writeLong(this.LJIIL);
        parcel.writeInt(this.LJIILIIL);
        parcel.writeString(this.LJIILJJIL);
        parcel.writeString(this.LJIILL);
        parcel.writeString(this.LJIILLIIL);
        parcel.writeString(this.LJIIZILJ);
        parcel.writeLong(this.LJIJ);
        parcel.writeLong(this.LJIJI);
        parcel.writeString(this.LJIJJ);
    }
}
