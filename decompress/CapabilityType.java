// 
// Decompiled by Procyon v0.6.0
// 

package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;

public enum CapabilityType
{
    BUS_FREQ_MAX("bus_freq_max", 8), 
    BUS_FREQ_MIN("bus_freq_min", 7), 
    CPU_AFFINITY("cpu_affinity", 12), 
    CPU_CORE_MAX("cpu_core_max", 4), 
    CPU_CORE_MIN("cpu_core_min", 3), 
    CPU_FREQ_MAX("cpu_freq_max", 2), 
    CPU_FREQ_MIN("cpu_freq_min", 1), 
    GPU_FREQ_MAX("gpu_freq_max", 6), 
    GPU_FREQ_MIN("gpu_freq_min", 5), 
    IDLE_STATE("idle_state", 13), 
    IO_PRELOAD("io_preload", 14), 
    NETWORK_ENHANCE("network_enhance", 15), 
    PRESET_SCENE("preset_scene", 16), 
    TASK_PRIORITY("task_priority", 11), 
    THUMB_FETCH("thumb_fetch", 17), 
    TYPE_MAX(capabilityType18), 
    TYPE_MIN(capabilityType), 
    UFS_FREQ_MAX("ufs_freq_max", 10), 
    UFS_FREQ_MIN("ufs_freq_min", 9), 
    VIBRATE_ENHANCE("vibrate_enhance", 18);
    
    public String LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(7);
    }
    
    public CapabilityType(final CapabilityType capabilityType) {
        this.LIZ = capabilityType.LIZ;
        this.LIZIZ = capabilityType.LIZIZ;
    }
    
    public CapabilityType(final String liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public static CapabilityType valueOf(final int n) {
        for (final CapabilityType capabilityType : values()) {
            if (n == capabilityType.LIZIZ) {
                return capabilityType;
            }
        }
        throw new RuntimeException("Can't find enum type for index: ".concat(String.valueOf(n)));
    }
    
    public final int getIndex() {
        return this.LIZIZ;
    }
    
    public final String getName() {
        return this.LIZ;
    }
}
