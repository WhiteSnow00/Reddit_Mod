// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Bundle;
import java.util.List;
import android.os.RemoteException;
import android.os.IInterface;

public interface u2 extends IInterface
{
    void E0(final q7 p0) throws RemoteException;
    
    void F(final q7 p0) throws RemoteException;
    
    List G0(final String p0, final String p1, final q7 p2) throws RemoteException;
    
    void J(final q7 p0) throws RemoteException;
    
    void R0(final c p0, final q7 p1) throws RemoteException;
    
    void T0(final long p0, final String p1, final String p2, final String p3) throws RemoteException;
    
    void V(final Bundle p0, final q7 p1) throws RemoteException;
    
    void a1(final t p0, final q7 p1) throws RemoteException;
    
    List g0(final String p0, final String p1, final String p2) throws RemoteException;
    
    void j1(final j7 p0, final q7 p1) throws RemoteException;
    
    String k0(final q7 p0) throws RemoteException;
    
    List k1(final String p0, final String p1, final String p2, final boolean p3) throws RemoteException;
    
    List n0(final String p0, final String p1, final boolean p2, final q7 p3) throws RemoteException;
    
    void w(final q7 p0) throws RemoteException;
    
    byte[] w0(final t p0, final String p1) throws RemoteException;
}
