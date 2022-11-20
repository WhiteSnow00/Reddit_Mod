// 
// Decompiled by Procyon v0.6.0
// 

package android.hardware.camera2.params;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession$StateCallback;
import java.util.concurrent.Executor;
import android.annotation.NonNull;
import java.util.List;
import android.os.Parcelable;

public final class SessionConfiguration implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public SessionConfiguration(final int n, @NonNull final List<OutputConfiguration> list, @NonNull final Executor executor, @NonNull final CameraCaptureSession$StateCallback cameraCaptureSession$StateCallback) {
    }
    
    public native Executor getExecutor();
    
    public native InputConfiguration getInputConfiguration();
    
    public native List<OutputConfiguration> getOutputConfigurations();
    
    public native int getSessionType();
    
    public native CameraCaptureSession$StateCallback getStateCallback();
    
    @Override
    public native int hashCode();
    
    public native void setSessionParameters(final CaptureRequest p0);
}
