// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import android.os.Bundle;
import java.util.List;
import android.os.RemoteException;
import android.os.IInterface;

public interface y2 extends IInterface
{
    void E0(final l7 p0) throws RemoteException;
    
    List K0(final String p0, final String p1, final l7 p2) throws RemoteException;
    
    List M(final String p0, final String p1, final boolean p2, final l7 p3) throws RemoteException;
    
    void M0(final long p0, final String p1, final String p2, final String p3) throws RemoteException;
    
    void P(final f7 p0, final l7 p1) throws RemoteException;
    
    void P0(final l7 p0) throws RemoteException;
    
    List V(final String p0, final String p1, final String p2) throws RemoteException;
    
    void b1(final l7 p0) throws RemoteException;
    
    List g1(final String p0, final String p1, final String p2, final boolean p3) throws RemoteException;
    
    void n1(final Bundle p0, final l7 p1) throws RemoteException;
    
    String o0(final l7 p0) throws RemoteException;
    
    void o1(final t p0, final l7 p1) throws RemoteException;
    
    void t1(final l7 p0) throws RemoteException;
    
    void u1(final c p0, final l7 p1) throws RemoteException;
    
    byte[] z(final t p0, final String p1) throws RemoteException;
}
