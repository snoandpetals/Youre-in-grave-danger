package com.b1n_ry.yigd.compat;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.List;

public interface InvModCompat<T> {
    List<InvModCompat<?>> invCompatMods = new ArrayList<>();
    static void initModCompat() {
        // invCompatMods.add(new TrinketsCompat());
    }

    String getModName();
    void clear(ServerPlayerEntity player);
    CompatComponent<T> readNbt(NbtCompound nbt);

    CompatComponent<T> getNewComponent(ServerPlayerEntity player);
}