// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import java.util.List;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import android.os.IInterface;

public interface 012 extends IInterface
{
    default static {
        Covode.recordClassIndex(93);
    }
    
    int LIZ(final 011 p0, final String p1, final Bundle p2);
    
    Bundle LIZ(final String p0, final Bundle p1);
    
    boolean LIZ(final long p0);
    
    boolean LIZ(final 011 p0);
    
    boolean LIZ(final 011 p0, final int p1, final Uri p2, final Bundle p3);
    
    boolean LIZ(final 011 p0, final Uri p1);
    
    boolean LIZ(final 011 p0, final Uri p1, final Bundle p2, final List<Bundle> p3);
    
    boolean LIZ(final 011 p0, final Bundle p1);
    
    public abstract static class a extends Binder implements 012
    {
        static {
            Covode.recordClassIndex(94);
        }
        
        public a() {
            this.attachInterface((IInterface)this, "android.support.customtabs.ICustomTabsService");
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            if (n == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            final Bundle bundle = null;
            final Bundle bundle2 = null;
            final Uri uri = null;
            Bundle bundle3 = null;
            final Bundle bundle4 = null;
            Bundle bundle5 = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 2: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    n = (this.LIZ(parcel.readLong()) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    n = (this.LIZ(011.a.LIZ(parcel.readStrongBinder())) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final 011 liz = 011.a.LIZ(parcel.readStrongBinder());
                    Uri uri2;
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n = (this.LIZ(liz, uri2, bundle5, parcel.createTypedArrayList(Bundle.CREATOR)) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final String string = parcel.readString();
                    Bundle bundle6 = bundle;
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    final Bundle liz2 = this.LIZ(string, bundle6);
                    parcel2.writeNoException();
                    if (liz2 != null) {
                        parcel2.writeInt(1);
                        liz2.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final 011 liz3 = 011.a.LIZ(parcel.readStrongBinder());
                    Bundle bundle7 = bundle2;
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n = (this.LIZ(liz3, bundle7) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 7: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final 011 liz4 = 011.a.LIZ(parcel.readStrongBinder());
                    Uri uri3 = uri;
                    if (parcel.readInt() != 0) {
                        uri3 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    n = (this.LIZ(liz4, uri3) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 8: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final 011 liz5 = 011.a.LIZ(parcel.readStrongBinder());
                    final String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n = this.LIZ(liz5, string2, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 9: {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    final 011 liz6 = 011.a.LIZ(parcel.readStrongBinder());
                    n = parcel.readInt();
                    Uri uri4;
                    if (parcel.readInt() != 0) {
                        uri4 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri4 = null;
                    }
                    Bundle bundle8 = bundle4;
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n = (this.LIZ(liz6, n, uri4, bundle8) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
            }
        }
        
        public static final class a implements 012
        {
            public IBinder LIZ;
            
            static {
                Covode.recordClassIndex(95);
            }
            
            public a(final IBinder liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final int LIZ(final 011 011, final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final Bundle LIZ(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
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
                    Bundle bundle2;
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle2 = null;
                    }
                    return bundle2;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final long n) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(n);
                    final IBinder liz = this.LIZ;
                    boolean b = false;
                    liz.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final 011 011) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    final IBinder liz = this.LIZ;
                    boolean b = false;
                    liz.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final 011 011, final int n, final Uri uri, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    obtain.writeInt(n);
                    boolean b = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        b = false;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final 011 011, final Uri uri) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    boolean b = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        b = false;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final 011 011, final Uri uri, final Bundle bundle, final List<Bundle> list) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    boolean b = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList((List)list);
                    this.LIZ.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        b = false;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean LIZ(final 011 011, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder binder;
                    if (011 != null) {
                        binder = 011.asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    boolean b = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.LIZ.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        b = false;
                    }
                    return b;
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
