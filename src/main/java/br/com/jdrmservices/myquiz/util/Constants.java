package br.com.jdrmservices.myquiz.util;

public class Constants {
	// actions
	public static final String ADD_ACTION = "ADICIONAR";
	public static final String EDIT_ACTION = "EDITAR";
	public static final String NO_ACTION = "";
	
	// messages
	public static final String MESSAGE_EXISTS = "Informações já cadastradas";
	public static final String MESSAGE_ADD_SUCCESS = "Informações gravadas com sucesso!";
	public static final String MESSAGE_ADD_ERROR = "Não foi possível gravar as informações";
	public static final String MESSAGE_ALTER_SUCCESS = "Informações alteradas com sucesso!";
	public static final String MESSAGE_ALTER_ERROR = "Não foi possível alterar as informações";
	public static final String MESSAGE_REMOVE_SUCCESS = "Informações excluídas com sucesso!";
	public static final String MESSAGE_REMOVE_ERROR = "Não foi possível excluir as informações";
	
	// validations
	public static final String NAME_REQUIRED = "Nome é obrigatório";
	public static final String EMAIL_REQUIRED = "E-mail é obrigatório";
	public static final String STATEMENT_QUESTION_REQUIRED = "O enunciado da questão é obrigatório";
	public static final String ALTERNATIVE_A = "Alternativa a é obrigatória";
	public static final String ALTERNATIVE_B = "Alternativa b é obrigatória";
	public static final String ALTERNATIVE_C = "Alternativa c é obrigatória";
	public static final String ALTERNATIVE_D = "Alternativa d é obrigatória";
	public static final String CORRECT_ALTERNATIVE = "Alternativa correta é obrigatória";
	public static final String RESPONSE_ALTERNATIVE = "Alternativa é obrigatória";
	public static final String PASSWORD_REQUIRED = "Senha é obrigatoria";
}
