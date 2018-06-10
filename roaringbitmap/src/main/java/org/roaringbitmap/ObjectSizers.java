package org.roaringbitmap;

public class ObjectSizers {

    private static class HotspotCompressedOops implements ObjectSizer {

        @Override
        public long getObjectHeaderSize() {
            return 12;
        }

        @Override
        public long getArrayHeaderSize() {
            return 16;
        }

        @Override
        public long getObjectPointerSize() {
            return 4;
        }

        @Override
        public long getPaddedSize(long unpaddedSize) {
            return unpaddedSize + 0x7 & ~0x7;
        }
    }
    public static final ObjectSizer HOTSPOT_COMPRESSED_OOPS = new HotspotCompressedOops();
}
