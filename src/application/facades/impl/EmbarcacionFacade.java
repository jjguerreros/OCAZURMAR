package application.facades.impl;

import java.util.List;

import application.daos.impl.EmbarcacionDao;
import application.errores.ErrorFacade;
import application.facades.BaseFacade;
import application.utils.StaticUtils;

public class EmbarcacionFacade implements BaseFacade {

	private final EmbarcacionDao dao = StaticUtils.getEmbarcacionDao();

	private static EmbarcacionFacade instance = null;

	private EmbarcacionFacade() {
	}

	public static EmbarcacionFacade getInistance() {
		if (instance == null) {
			instance = new EmbarcacionFacade();
		}
		return instance;
	}

	@Override
	public Boolean alta(Object ob) throws ErrorFacade {
		try {
			return dao.alta(ob);
		} catch (Exception e) {
			throw new ErrorFacade(e);
		}
	}

	@Override
	public Boolean baja(Object ob) throws ErrorFacade {
		try {
			return dao.baja(ob);
		} catch (Exception e) {
			throw new ErrorFacade(e);
		}
	}

	@Override
	public Boolean modificacion(Object ob) throws ErrorFacade {
		try {
			return modificacion(ob);
		} catch (Exception e) {
			throw new ErrorFacade(e);
		}
	}

	@Override
	public List<Object> consulta(Object ob) throws ErrorFacade {
		try {
			return dao.consulta(ob);
		} catch (Exception e) {
			throw new ErrorFacade(e);
		}
	}

	@Override
	public List<Object> lista() throws ErrorFacade {
		try {
			return dao.lista();
		} catch (Exception e) {
			throw new ErrorFacade(e);
		}
	}
}
