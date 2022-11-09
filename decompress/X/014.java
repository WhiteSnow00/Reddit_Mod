// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Binder;
import android.app.Notification;
import com.bytedance.covode.number.Covode;
import android.os.IInterface;

public interface 014 extends IInterface
{
    default static {
        Covode.recordClassIndex(99);
    }
    
    void LIZ(final String p0);
    
    void LIZ(final String p0, final int p1, final String p2);
    
    void LIZ(final String p0, final int p1, final String p2, final Notification p3);
    
    public abstract static class a extends Binder implements 014
    {
        static {
            Covode.recordClassIndex(100);
        }
        
        public boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
            if (int1 == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                final String string = parcel.readString();
                int1 = parcel.readInt();
                final String string2 = parcel.readString();
                Notification notification;
                if (parcel.readInt() != 0) {
                    notification = (Notification)Notification.CREATOR.createFromParcel(parcel);
                }
                else {
                    notification = null;
                }
                this.LIZ(string, int1, string2, notification);
                return true;
            }
            if (int1 == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                this.LIZ(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (int1 == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                this.LIZ(parcel.readString());
                return true;
            }
            if (int1 != 1598968902) {
                return super.onTransact(int1, parcel, parcel2, n);
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }
        
        public static final class a implements 014
        {
            public static 014 LIZ;
            public IBinder LIZIZ;
            
            static {
                Covode.recordClassIndex(101);
            }
            
            public a(final IBinder liziz) {
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ(final String s) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    if (!this.LIZIZ.transact(3, obtain, (Parcel)null, 1)) {
                        final 014 liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(s);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final String s, final int n, final String s2) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    obtain.writeInt(n);
                    obtain.writeString(s2);
                    if (!this.LIZIZ.transact(2, obtain, (Parcel)null, 1)) {
                        final 014 liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(s, n, s2);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final String s, final int n, final String s2, final Notification notification) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    obtain.writeInt(n);
                    obtain.writeString(s2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(1, obtain, (Parcel)null, 1)) {
                        final 014 liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(s, n, s2, notification);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public final IBinder asBinder() {
                return this.LIZIZ;
            }
        }
    }
}
