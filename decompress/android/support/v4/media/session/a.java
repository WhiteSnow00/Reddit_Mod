// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.support.v4.media.MediaMetadataCompat;
import android.os.RemoteException;
import android.os.IInterface;

public interface a extends IInterface
{
    void A0() throws RemoteException;
    
    void G() throws RemoteException;
    
    void G0() throws RemoteException;
    
    void M0(final MediaMetadataCompat p0) throws RemoteException;
    
    void Y0(final ParcelableVolumeInfo p0) throws RemoteException;
    
    void m0() throws RemoteException;
    
    void w1(final PlaybackStateCompat p0) throws RemoteException;
}
