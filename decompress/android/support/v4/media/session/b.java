// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.KeyEvent;
import android.net.Uri;
import android.support.v4.media.RatingCompat;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface b extends IInterface
{
    void B0() throws RemoteException;
    
    void C0(final Bundle p0, final String p1) throws RemoteException;
    
    Bundle D0() throws RemoteException;
    
    void F(final RatingCompat p0, final Bundle p1) throws RemoteException;
    
    void F0(final Uri p0, final Bundle p1) throws RemoteException;
    
    boolean I0(final KeyEvent p0) throws RemoteException;
    
    void K(final int p0) throws RemoteException;
    
    void L() throws RemoteException;
    
    void L0(final MediaDescriptionCompat p0, final int p1) throws RemoteException;
    
    void N(final String p0, final Bundle p1, final MediaSessionCompat.ResultReceiverWrapper p2) throws RemoteException;
    
    void O0() throws RemoteException;
    
    String Q() throws RemoteException;
    
    void Q0(final Bundle p0, final String p1) throws RemoteException;
    
    void T(final a p0) throws RemoteException;
    
    void T0(final long p0) throws RemoteException;
    
    void V0(final int p0) throws RemoteException;
    
    boolean W() throws RemoteException;
    
    void Z0(final RatingCompat p0) throws RemoteException;
    
    void b1(final MediaDescriptionCompat p0) throws RemoteException;
    
    void c() throws RemoteException;
    
    CharSequence d0() throws RemoteException;
    
    void d1(final MediaDescriptionCompat p0) throws RemoteException;
    
    void e(final float p0) throws RemoteException;
    
    PlaybackStateCompat f() throws RemoteException;
    
    void g0(final a p0) throws RemoteException;
    
    Bundle getExtras() throws RemoteException;
    
    long getFlags() throws RemoteException;
    
    String getTag() throws RemoteException;
    
    void h0(final int p0, final int p1) throws RemoteException;
    
    void h1(final int p0, final int p1) throws RemoteException;
    
    void i1() throws RemoteException;
    
    void l() throws RemoteException;
    
    void l0(final boolean p0) throws RemoteException;
    
    MediaMetadataCompat n() throws RemoteException;
    
    void next() throws RemoteException;
    
    void o(final int p0) throws RemoteException;
    
    ParcelableVolumeInfo o0() throws RemoteException;
    
    void pause() throws RemoteException;
    
    void play() throws RemoteException;
    
    void prepare() throws RemoteException;
    
    void previous() throws RemoteException;
    
    void q() throws RemoteException;
    
    void s1() throws RemoteException;
    
    void seekTo(final long p0) throws RemoteException;
    
    void stop() throws RemoteException;
    
    void t1(final Bundle p0, final String p1) throws RemoteException;
    
    void u0(final Bundle p0, final String p1) throws RemoteException;
    
    void v(final Uri p0, final Bundle p1) throws RemoteException;
    
    void w() throws RemoteException;
    
    PendingIntent x() throws RemoteException;
    
    void x0(final Bundle p0, final String p1) throws RemoteException;
}
