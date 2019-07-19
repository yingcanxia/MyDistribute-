package cn.shadow.user;

import cn.shadow.dto.SelectRequest;
import cn.shadow.dto.SelectResponse;

public interface IUserService {
	public SelectResponse select(SelectRequest request);
}
