/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import portugol.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseAIdVar(AIdVar node);
    void caseAIdArrayVar(AIdArrayVar node);
    void caseAStringValor(AStringValor node);
    void caseANIntValor(ANIntValor node);
    void caseANRealValor(ANRealValor node);
    void caseARealTipo(ARealTipo node);
    void caseAIntegerTipo(AIntegerTipo node);
    void caseACharTipo(ACharTipo node);
    void caseAVariableDeclaracao(AVariableDeclaracao node);
    void caseAConstDeclaracao(AConstDeclaracao node);
    void caseAVarSemicolon(AVarSemicolon node);
    void caseAAssignmentComando(AAssignmentComando node);
    void caseAReadComando(AReadComando node);
    void caseACommaVar(ACommaVar node);
    void caseAComparacaoExp1(AComparacaoExp1 node);
    void caseAExp1Exp1(AExp1Exp1 node);
    void caseASomaExp2(ASomaExp2 node);
    void caseAExp2Exp2(AExp2Exp2 node);
    void caseAExpLogicaExp2(AExpLogicaExp2 node);
    void caseAMaisSoma(AMaisSoma node);
    void caseAMenosSoma(AMenosSoma node);
    void caseAIgualComparacao(AIgualComparacao node);
    void caseADiferenteComparacao(ADiferenteComparacao node);
    void caseAMenorIgualComparacao(AMenorIgualComparacao node);
    void caseAMaiorIgualComparacao(AMaiorIgualComparacao node);
    void caseAMenorComparacao(AMenorComparacao node);
    void caseAMaiorComparacao(AMaiorComparacao node);
    void caseAExp2Exp3(AExp2Exp3 node);
    void caseAExp3Exp3(AExp3Exp3 node);
    void caseAMultMultDiv(AMultMultDiv node);
    void caseADivMultDiv(ADivMultDiv node);
    void caseAParentesesExpExp4(AParentesesExpExp4 node);
    void caseAExp5Exp4(AExp5Exp4 node);
    void caseAValorExp5(AValorExp5 node);
    void caseAVarExp5(AVarExp5 node);
    void caseAOuExpLogica1(AOuExpLogica1 node);
    void caseAXorExpLogica1(AXorExpLogica1 node);
    void caseAExpLogica2ExpLogica1(AExpLogica2ExpLogica1 node);
    void caseAEExpLogica2(AEExpLogica2 node);
    void caseAExpLogica3ExpLogica2(AExpLogica3ExpLogica2 node);
    void caseANotExpLogica3(ANotExpLogica3 node);

    void caseTProgram(TProgram node);
    void caseTBegin(TBegin node);
    void caseTEnd(TEnd node);
    void caseTDot(TDot node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTConst(TConst node);
    void caseTComma(TComma node);
    void caseTReal(TReal node);
    void caseTInteger(TInteger node);
    void caseTChar(TChar node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTLArrow(TLArrow node);
    void caseTRead(TRead node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTWrite(TWrite node);
    void caseTIf(TIf node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTEndIf(TEndIf node);
    void caseTEvaluate(TEvaluate node);
    void caseTCase(TCase node);
    void caseTEndEvaluate(TEndEvaluate node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTEndWhile(TEndWhile node);
    void caseTRepeat(TRepeat node);
    void caseTUntil(TUntil node);
    void caseTFor(TFor node);
    void caseTOf(TOf node);
    void caseTStep(TStep node);
    void caseTEndFor(TEndFor node);
    void caseTMinus(TMinus node);
    void caseTPlus(TPlus node);
    void caseTStar(TStar node);
    void caseTBar(TBar node);
    void caseTEqual(TEqual node);
    void caseTNotEqual(TNotEqual node);
    void caseTLEqual(TLEqual node);
    void caseTGEqual(TGEqual node);
    void caseTLess(TLess node);
    void caseTGreater(TGreater node);
    void caseTNot(TNot node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTId(TId node);
    void caseTLineComment(TLineComment node);
    void caseTBlockCommnetStart(TBlockCommnetStart node);
    void caseTBlockCommentEnd(TBlockCommentEnd node);
    void caseTBlockCommentBody(TBlockCommentBody node);
    void caseTString(TString node);
    void caseTVector(TVector node);
    void caseTNInt(TNInt node);
    void caseTNReal(TNReal node);
    void caseTBlank(TBlank node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
