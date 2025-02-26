public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFL; // Mask with 32 one-bits
}
