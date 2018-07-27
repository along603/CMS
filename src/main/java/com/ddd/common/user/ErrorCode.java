package com.ddd.common.user;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: hemeijin
 * Date: 13-6-7
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public enum ErrorCode implements EnumPower {
	SUCCEED("200", "成功"),
	REQUEST_BODY_EMPTY("500", "请求体为空"),
	REQUEST_BODY_PARSE_ERROR("6001", "请求格式错误"),
	REQUEST_BODY_PARAMS_ERROR("500", "请求体必填参数[attribut=]为空"),
	REQUEST_DATA_ERROR("5001", "请求数据非法"),
	SERVER_ERRORS("500", "服务器内部错误"),
	DATABASE_ACCESS_ERROR("500", "数据库访问错误"),
	SERVICE_BUSINESS_EXCEPTION("501", "业务逻辑错误"),
	NULL_ERROR("34111001", "请求对象为空或非空字段请求信息为空"),
	OPCODE_ERROR("34111002", "操作码非法"),
	//**********************商品类错误码信息20*****************************
	PRODOFFER_CODE_EMPTY("34117003","商品编码为空"),
	PRODOFFER_IS_EXIST("34117001","商品信息已存在"),
	PRODOFFER_NO_EXIST("34017000","商品信息不存在"),
	PRODOFFER_CODE_ERROR("34117003","商品编码非法"),
	PRODOFFER_NAME_ERROR("34117004","商品名称非法"),
	PRODOFFER_STATUS_ERROR("34117005","商品状态非法"),
	PRODOFFER_DESC_ERROR("34117006","商品描述非法"),
	PRODOFFER_PRICE_ERROR("34117007","商品价格非法"),
	PRODOFFER_CHARGE_MODE_ERROR("34117008","商品计费类型非法"),
	PRODOFFER_CHARGE_TERM_ERROR("34117009","商品授权数量非法"),
	PRODOFFER_CHARGE_TERM_UNIT_ERROR("34117010","商品授权单位非法"),
	PRODOFFER_EFFECT_DATE_ERROR("34117011","商品有效时间非法"),
	PRODOFFER_EXPIRE_DATE_ERROR("34117012","商品失效时间非法"),
	PRODOFFER_PRODUCT_CODE_ERROR("34117013","商品对应的产品编码非法"),
	PRODOFFER_PRODUCT_TYPE_ERROR("34117014","商品对应的产品类型非法"),
	PRODOFFER_PERIOD_ERROR("34117015","商品已过有效期"),
	PRODOFFER_CODE_IS_NULL("34117016","商品编码为空"),
	PRODOFFER_ALLOW_TIME_ERROR("34117017","可用时长非法"),
	PRODOFFER_ALLOW_COUNT_ERROR("34117018","可用次数非法"),
	PRODOFFER_ALLOW_MB_NULL("34117019","可用流量非法"),
	PRODOFFER_TYPE_NULL("34117020","商品类型非法"),
	PRODOFFER_PROD_IS_NULL("34117021","商品对应的产品为空"),
	PRODOFFER_PACKAGE_PO_IS_NULL("34117022","商品包对应的商品为空"),
	PRODOFFER_PROVIDER_CODE_IS_NULL("34117023","商品提供商编码为空"),
	//**********************商品购买错误信息33*****************************
	PRODOFFER_ALREADY_BUY("34118301","该商品已购买"),
	CUSTOMER_LEAVING_CREDIT_NOT_ENOUGH("34118302","您的剩余信用额度不够购买此商品"),
	SUB_START_DATE_IS_NULL("34118303","subType为1时,startDate不能为空"),
	SUB_END_DATE_IS_NULL("34118304","subType为1时,endDate不能为空"),
	VALIDATE_ERROR("34118305", "密码效验失败"),
	VALIDATE_ERROR_MAX("34118306", "密码效验失败超过5次"),
	PRODOFFER_FREE_CAN_NOT_PURCHARSE("34118307", "免费商品无需购买"),
	PRODOFFER_PADAPTER_RETURN_FAIL("34118308", "PADAPTER返回失败"),
	PRODOFFER_ACCOUNTS_PERIOD("34118309", "对不起，系统正在出账，暂停该业务，次日将恢复该业务"),
	PRODOFFER_PRODUCT_FLAG_UNKNOW("34118310", "产品标识未知"),
	PRODOFFER_DEFAULT_CREDIT_NOT_EXIST("34118311", "信用额度信息不存在"),
	//**********************产品类错误码信息21*****************************
	PRODUCT_IS_EXIST("34117101","产品信息已存在"),
	PRODUCT_NO_EXIST("34117102","产品信息不存在"),
	PRODUCT_ATOM_NO_EXIST("34117103","原子产品信息不存在"),
	SUB_PRODUCT_NO_EXIST("34117104","子产品信息不存在"),
	PRODUCT_CODE_ERROR("34117105","产品编码非法"),
	PRODUCT_NAME_ERROR("34117106","产品名称非法"),
	PRODUCT_TYPE_ERROR("34117107","产品类型非法"),
	SUB_PRODUCT_CODE_NO_NULL("34117108","子产品编码非空"),
	CONTENTCODE_IS_NULL("34117109","内容编码为空"),
	PRODUCT_STATUS_ERROR("34117110","产品状态非法"),
	//产品同步错误编码
	PRODUCT_CODE_IS_NULL("34117111","产品编码为空"),
	PRODUCT_NAME_IS_NULL("34117112","产品名称为空"),
	PROVIDER_ID_IS_NULL("34117113","提供商编码为空"),
	CONTENT_TYPE_IS_NULL("34117114","内容类型为空"),
	PRODUCT_STATUS_IS_NULL("34117115","产品状态为空"),
	BUSINESS_CODE_IS_NULL("34117116","业务编码为空"),
	PRODUCT_EFFDATE_IS_NULL("34117117","产品生效时间为空"),
	PRODUCT_EXPDATE_IS_NULL("34117118","产品失效时间为空"),
	PRODUCT_TYPE_IS_NULL("34117119","产品类型为空"),
	PRODUCT_CODE_LIST_IS_NULL("34117120","产品包所关联的产品编码列表为空"),
	
	PRODUCT_PERIOD_ERROR("34117121","产品已过有效期"),
	//**********************用户组错误码信息22*****************************
	CUST_GROUP_IS_EXIST("34117201","用户组信息已存在"),
	CUST_GROUP_NO_EXIST("34117202","用户组信息不存在"),
	CUST_GROUP_STATUS_ERROR("34117203","用户组状态错误"),
	//**********************区域错误码信息23*****************************
	REGION_IS_EXIST("34117301","区域信息已存在"),
	REGION_NO_EXIST("34117302","区域信息不存在"),
	REGION_PARENT_CODE_NO_EXIST("34117303","父区域编码信息不存在"),
	//**********************集团错误码信息24*****************************
	BLOC_IS_EXIST("34117401","集团信息已存在"),
	BLOC_NO_EXIST("34117402","集团信息不存在"),
	//**********************客户类型错误码信息25*****************************
	CUST_TYPE_IS_EXIST("34117501","客户类型信息已存在"),
	CUST_TYPE_NO_EXIST("34117502","客户类型信息不存在"),
	//**********************客户错误码信息26*****************************
	CUSTOMER_IS_EXIST("34117601","客户信息已存在"),
	CUSTOMER_NO_EXIST("34117602","客户信息不存在"),
	CUSTOMER_STATUS_ERROR("34117603","客户状态非法"),
	CUSTOMER_CODE_IS_NULL("34117604","客户编码为空"),
	CUSTOMER_SYNC_TYPE_IS_NULL("34117605","同步类型为空"),
	//**********************业务错误码信息27*****************************
	BUSINESS_IS_EXIST("34117701","业务信息已存在"),
	BUSINESS_NO_EXIST("34117702","业务信息不存在"),
	BUSINESS_STATUS_ERROR("34117703","业务状态非法"),
	BUSINESS_CREATDATE_ERROR("34117704","业务创建时间格式错误"),
	//**********************手机用户错误码信息28*****************************
	MOBILE_NO_EXIST("34117801","手机用户信息不存在"),
	MOBILE_STATUS_ERROR("34117802","手机用户状态非法"),
	LOGIN_NO_EXIST("34117803","用户名或密码为空"),
	LOGIN_ERROR("34047001","登录用户名密码效验失败"),
	//**********************机顶盒用户错误码信息29*****************************
	STB_NO_EXIST("34117901","机顶盒用户信息不存在"),
	STB_STATUS_ERROR("34117902","机顶盒用户状态非法"),
	STB_ID_NO_EXIST("34117903","智能卡号为空"),
	//**********************PC用户错误码信息30*****************************
	PC_NO_EXIST("34118001","PC用户信息不存在"),
	PC_STATUS_ERROR("34118002","PC用户状态非法"),
	//**********************采集错误码信息31*****************************
	RTM_IS_EXIST("34118101","采集物理文件已存在"),
	RTM_NO_EXIST("34118102","采集物理文件不存在"),
	//**********************内容错误码信息32*****************************
	CONTENT_NO_EXIST("34118201","内容信息不存在"),
	CONTENT_STATUS_ERROR("34118202","内容状态非法"),
	CONTENT_PACKAGE_IS_EXIST("34118203","内容包编码已存在"),
	CONTENT_PACKAGE_NO_EXIST("34118204","内容包编码不存在"),
	//**********************时移点播错误信息34*****************************
	PROGRAM_NO_EXIST("34118401","节目单不存在"),
	CHANNEL_NO_EXIST("34118402","频道不存在"),
	TSPHYSICALCONTENTLIST_NO_EXIST("34118403","采集物理文件不存在"),
	//**********************开机认证错误信息35*****************************
	QUERY_CHANNEL_FOR_CUSTOMER_FAIL("34118501","获取客户订购的时移频道列表失败!"),
	//**********************鉴权错误信息35*****************************
	AUTHENTICATE_FAIL("34118601","您没有权限使用!"),
    //**********************服务错误信息*****************************
    SERVICE_IS_NULL("34118701","服务编码为空"),
    SERVICE_NO_EXIST("34118702","不支持该服务"),

    DEMANDTYPE_NO_EXIST("34118703","点播类型为空或不支持该点播类型"),
    TERMINALTYPE_NO_EXIST("34118704","终端类型为空或不支持该点播类型"),

    //**********************用户错误码信息*****************************
    USER_NO_EXIST("34118726","用户信息不存在"),
    USER_STATUS_ERRORS("34118705","用户状态非法"),
    USER_CODE_IS_NULL("34118706","用户编码为空"),
    USER_SYNC_TYPE_IS_NULL("34118707","同步类型为空"),
    USER_PASSWORD_VALIDATE_ERROR("34118708","用户密码验证失败"),
    
    

	//**********************登录用户错误码信息30*****************************
    LOGIN_USER_NO_EXIST("34047002","登录用户不存在"),
    LOGIN_USER_OLD_PWD_WRONG("34118706","旧密码不正确"),
    LOGIN_USER_QA_WRONG("34118707","问题或答案不正确"),
    LOGIN_USER_NAME_EXISTS("34117201","登录名已存在"),
    LOGIN_USER_NAME_EMPTY("34118709","找回密码时，用户名为空"),
    LOGIN_USER_GETPASSWD_QUESTION_EMPTY("34118710","找回密码时，问题为空"),
    LOGIN_USER_GETPASSWD_ANSWER_EMPTY("34118711","找回密码时，答案为空"),
    LOGIN_USER_OLDPASSWD_EMPTY("34118712","旧密码为空"),
    LOGIN_USER_NEWPASSWD_EMPTY("34118713","新密码为空"),
    LOGIN_USER_EMAIL_EMPTY("34118714","邮箱为空"),
    LOGIN_USER_PASSWD_EMPTY("34118715","密码为空"),
    LOGIN_USER_REG_ANSWER_EMPTY("34118716","注册时，如果问题不为空，则答案也不能为空"),
    USER_CODE_EMPTY("34118717","用户编码为空"),
    LOGIN_USER_LOGIN_NAME_EMPTY("34118718","登录用户名为空"),
    LOGIN_USER_TVN_NUM_EMPTY("34118719","TVN号为空"),
    LOGIN_USER_TVN_PAS_EMPTY("34118720","TVN密码为空"),
    LOGIN_USER_DEVICE_TYPE_EMPTY("34118721","终端设备型号为空"),
    LOGIN_USER_MAC_EMPTY("34118722","MAC地址为空"),
    LOGIN_USER_DEVICE_CODE_EMPTY("34118723","终端唯一标识为空"),
    LOGIN_USER_LOGO_URL_EMPTY("34118724","用户LOGO路径为空"),
    LOGIN_USER_GENDER_EMPTY("34118725","性别为空"),
    LOGIN_USER_TVN_REF_MAX_ERROR("34117203","TVN绑定用户数超过设置个数5"),
    LOGIN_USER_TVN_VALIDATE_ERROR("34118727","用户tvn号密码效验失败"),
    LOGIN_USER_DEVICE_REF_MAX_ERROR("34118728","登录用户绑定终端数超出5个"),
    TGT_NULL_ERROR("34118729","TGT为空"),
    TGT_VALIDATE_FALSE("34118730","TGT效验失败"),
    USER_DEVICE_UNBIND("34118731","终端设备未与登录用户绑定"),
    LOGIN_TIMESTAMP_NOT_EXIST("34118732","登录时间戳不存在,请重新获取时间戳"),
    LOGIN_USER_FOR_TVN_IS_NOT_EXIST("34118733","TVN对应的用户不存在"),
    DEVICEID_OR_MAC_EMPTY("34118734","MAC地址和deviceId不能同时为空"),
    SSO_SERVER_CONNECTION_ERROR("34118735","SSO服务器连接失败"),
    TVN_LOGIN_USER_REF_IS_NOT_EXIST("34007207","用户与TVN号没有绑定关系"),
    GENDER_FORMAT_IS_ERROR("34007208","性别格式不正确"),
    TVN_IS_ERROR("34007209","用户tvn号错误"),
    LOGIN_USER_LOCATION_DETAIL_CODE_EMPTY("34007210","获取登录用户详细地址编码失败"),

    //**********************账单错误码信息*****************************
    BILLING_NO_EXIST("34128705","账单信息不存在"),
    BILLING_STATUS_ERRORS("34128706","账单状态非法"),
    
    //**********************资质同步错误码信息*****************************
    APTITUDE_ID_IS_NULL("34118740","资质ID为空"),
    APTITUDE_CODE_IS_NULL("34118741","资质CODE为空"),
    APTITUDE_OGR_ID_IS_NULL("34118742","机构ID为空"),
    APTITUDE_TYPE_CODE_IS_NULL("34118743","资质类型为空"),
    APTITUDE_REL_ID_IS_NULL("34118744","关联资质ID为空"),
    APTITUDE_SERVICE_CODE_IS_NULL("34118745","服务编码为空"),
    APTITUDE_STATUS_IS_NULL("34118746","状态为空"),
    APTITUDE_SECRET_KEY_IS_NULL("34118747","资质密码为空"),
    
    SP_IS_NULL("34077901","Sp不存在"),
    SP_STATUS_IS_ERROR("34077902","Sp状态非法"),
    SP_MD5_IS_ERROR("34077903","密码错误"),
    SP_CSI_IS_NULL("34077904","csi为空"),
    SP_TOKEN_IS_NULL("34077905","token为空"),
    SP_STAMP_IS_NULL("34077906","stamp为空"),
    
    PRODUCT_BUSINESS_REF_ERROR("34077907","产品与业务关联关系不存在"),
    PRODUCT_CONTENT_REF_IS_NULL("34077908","产品没有关联内容"),
    CONTENT_IS_NOT_IN_PRODUCT("34077909","内容不在产品内"),
    
        //**********************订购关系同步错误码信息*****************************
    SUBSCRIBER_CODE_IS_NULL("34128801","订单号为空"),
    STATUS_IS_NULL("34128802","状态为空"),
    SUBSCRIBER_TIME_IS_NULL("34128803","订购时间为空"),
    EFFECTION_TIME_IS_NULL("34128804","生效时间为空"),
    EXPIRATION_TIME_IS_NULL("34128805","失效时间为空"),
    PRODUCTOFFERING_CODE_IS_NULL("34128806","商品编码为空"),
    SUBSCRIBER_TVN__IS_NULL("34128807","TVN号为空"),
    
    //**********************BOSS购买错误码信息*****************************
    BOSS_PURCHASE_RETURN_NULL("34128901","BOSS购买返回空"),
    BOSS_PURCHASE_FAIL("34128902","BOSS购买失败"),
    
    //**********************订购关系鉴权错误码信息*****************************
    SUBSCRIBER_NOT_EXIST("34129001","不存在订购关系"),
    SUBSCRIBER_UN_VALIDATE("34129002","订购关系不在有效期或不是正常状态"),
    
    //**********************批价错误码信息*****************************
    CHARGE_PO_REF_PROD_NOT_EXIST("34129101","商品没有关联产品"),   
    CHARGE_PO_IS_NOT_CM_ONETIME("34129102","非一次性商品，不能扣费"),  
    PO_CAN_NOT_BUY_ONLINE("34129103","该商品不支持在线购买"),
    
    //******************tvn  授权码 错误信息******modify by wujie************************************
    TVN_AUTHCODE_EXIST("34129104","TVN没有对应的授权码信息"),
    
    //*********** 校园网用户错误码信息 add by fanqijun *************
    MOBILE_USER_NOT_REGISTERED("34129105", "手机用户未注册"),
    MOBILE_USER_WRONG_PASSWORD("34129106", "手机用户密码错误"),
    MOBILE_USER_STATUS_CANCELLED("34129107", "手机用户已注销"),
    MOBILE_USER_EMPTY_SCHOOL_CODE("34129107", "手机用户无校园编码"),
    ;



	private String code = null;
	private String message = null;
	private static Hashtable<String, ErrorCode> aliasEnums;

	ErrorCode(String code, String message) {
		this.init(code, message);
	}

	private void init(String code, String message) {
		this.code = code;
		this.message = message;
		synchronized (this.getClass()) {
			if (aliasEnums == null) {
				aliasEnums = new Hashtable<String, ErrorCode>();
			}
		}
		aliasEnums.put(code, this);
		aliasEnums.put(message, this);
	}

	public static ErrorCode valueOfAlias(String alias) {
		return aliasEnums.get(alias);
	}

	public static ErrorCode valueOfAlias(char alias) {
		return aliasEnums.get(String.valueOf(alias));
	}

	@Override
    public String getCode() {
		return this.code;
	}

	@Override
    public char getChar() {
		return this.code.charAt(0);
	}

	@Override
    public String getMessage() {
		return this.message;
	}


	/**
	 * 信息描述
	 *
	 * @return String
	 */
	@Override
	public String toString() {
		return this.getMessage() + "〔信息代码：" + this.getCode() + "〕";
	}
}