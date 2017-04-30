package com.buuz135.industrial.tile.block;

import com.buuz135.industrial.tile.CropEnrichMaterialInjectorTile;
import net.minecraft.block.material.Material;

public class CropEnrichMaterialInjectorBlock extends CustomOrientedBlock<CropEnrichMaterialInjectorTile> {

    public CropEnrichMaterialInjectorBlock() {
        super("crop_enrich_material_injector", CropEnrichMaterialInjectorTile.class, Material.ROCK);
    }
}