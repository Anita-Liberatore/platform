package com.dashboard.platform.v1.batch;

public abstract class BaseBatch implements Batch {

	/**
	 * Esecuzione della logica del batch
	 */
	protected abstract void doBatchBase();



	@Override
	public final void doBatch() {
		doBatchBase();

	}

}
