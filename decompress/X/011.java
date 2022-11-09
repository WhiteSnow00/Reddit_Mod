// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.Bundle;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import android.os.IInterface;

public interface 011 extends IInterface
{
    default static {
        Covode.recordClassIndex(90);
    }
    
    void LIZ(final int p0, final Uri p1, final boolean p2, final Bundle p3);
    
    void LIZ(final int p0, final Bundle p1);
    
    void LIZ(final Bundle p0);
    
    void LIZ(final String p0, final Bundle p1);
    
    void LIZIZ(final String p0, final Bundle p1);
    
    public abstract static class a extends Binder implements 011
    {
        static {
            Covode.recordClassIndex(91);
        }
        
        public a() {
            this.attachInterface((IInterface)this, "android.support.customtabs.ICustomTabsCallback");
        }
        
        public static 011 LIZ(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof 011) {
                return (011)queryLocalInterface;
            }
            return new 011.a.a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            Bundle bundle = null;
            final Bundle bundle2 = null;
            final Bundle bundle3 = null;
            final Bundle bundle4 = null;
            Bundle bundle5 = null;
            if (n == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                n = parcel.readInt();
                Bundle bundle6 = bundle4;
                if (parcel.readInt() != 0) {
                    bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(n, bundle6);
                parcel2.writeNoException();
                return true;
            }
            if (n == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                final String string = parcel.readString();
                Bundle bundle7 = bundle3;
                if (parcel.readInt() != 0) {
                    bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(string, bundle7);
                parcel2.writeNoException();
                return true;
            }
            if (n == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                Bundle bundle8 = bundle2;
                if (parcel.readInt() != 0) {
                    bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(bundle8);
                parcel2.writeNoException();
                return true;
            }
            if (n == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                final String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZIZ(string2, bundle);
                parcel2.writeNoException();
                return true;
            }
            if (n == 6) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                n = parcel.readInt();
                Uri uri;
                if (parcel.readInt() != 0) {
                    uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                else {
                    uri = null;
                }
                final boolean b = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(n, uri, b, bundle5);
                parcel2.writeNoException();
                return true;
            }
            if (n != 1598968902) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        
        public static final class a implements 011
        {
            public IBinder LIZ;
            
            static {
                Covode.recordClassIndex(92);
            }
            
            public a(final IBinder liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(int n, final Uri uri, final boolean b, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(n);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final int n, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZIZ(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public final IBinder asBinder() {
                return this.LIZ;
            }
        }
    }
}
