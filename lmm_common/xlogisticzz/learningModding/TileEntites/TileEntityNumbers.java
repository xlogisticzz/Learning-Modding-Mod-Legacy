package xlogisticzz.learningModding.TileEntites;

import net.minecraft.tileentity.TileEntity;
import xlogisticzz.learningModding.Lib.Constants;
import xlogisticzz.learningModding.Lib.Ids;

public class TileEntityNumbers extends TileEntity {

    private int number;
    private int tick;

    @Override
    public void updateEntity() {
        if (!worldObj.isRemote && ++tick == 20) {
            number = (number + 1) % Constants.Misc.NUMBER_COUNT;
            worldObj.addBlockEvent(xCoord, yCoord, zCoord, Ids.NUMBER, 1, number);
            tick = 0;
        }
    }

    @Override
    public boolean receiveClientEvent(int id, int value) {
        if (worldObj.isRemote && id == 1) {
            number = value;
            worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);
        }
        return true;
    }

    public int getNumber() {
        return number;
    }

}
