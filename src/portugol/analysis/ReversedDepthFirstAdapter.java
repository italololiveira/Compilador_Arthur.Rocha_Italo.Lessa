/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAPrograma(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAIdArrayVar(AIdArrayVar node)
    {
        defaultIn(node);
    }

    public void outAIdArrayVar(AIdArrayVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        inAIdArrayVar(node);
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdArrayVar(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANIntValor(ANIntValor node)
    {
        defaultIn(node);
    }

    public void outANIntValor(ANIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANIntValor(ANIntValor node)
    {
        inANIntValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outANIntValor(node);
    }

    public void inANRealValor(ANRealValor node)
    {
        defaultIn(node);
    }

    public void outANRealValor(ANRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANRealValor(ANRealValor node)
    {
        inANRealValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outANRealValor(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAIntegerTipo(AIntegerTipo node)
    {
        defaultIn(node);
    }

    public void outAIntegerTipo(AIntegerTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerTipo(AIntegerTipo node)
    {
        inAIntegerTipo(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerTipo(node);
    }

    public void inACharTipo(ACharTipo node)
    {
        defaultIn(node);
    }

    public void outACharTipo(ACharTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        inACharTipo(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharTipo(node);
    }

    public void inAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclaracao(AVariableDeclaracao node)
    {
        inAVariableDeclaracao(node);
        {
            List<PVarSemicolon> copy = new ArrayList<PVarSemicolon>(node.getVarSemicolon());
            Collections.reverse(copy);
            for(PVarSemicolon e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVariableDeclaracao(node);
    }

    public void inAConstDeclaracao(AConstDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracao(AConstDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        inAConstDeclaracao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        outAConstDeclaracao(node);
    }

    public void inAVarSemicolon(AVarSemicolon node)
    {
        defaultIn(node);
    }

    public void outAVarSemicolon(AVarSemicolon node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarSemicolon(AVarSemicolon node)
    {
        inAVarSemicolon(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarSemicolon(node);
    }

    public void inAAssignmentComando(AAssignmentComando node)
    {
        defaultIn(node);
    }

    public void outAAssignmentComando(AAssignmentComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentComando(AAssignmentComando node)
    {
        inAAssignmentComando(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAssignmentComando(node);
    }

    public void inAReadComando(AReadComando node)
    {
        defaultIn(node);
    }

    public void outAReadComando(AReadComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadComando(AReadComando node)
    {
        inAReadComando(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        {
            List<PCommaVar> copy = new ArrayList<PCommaVar>(node.getCommaVar());
            Collections.reverse(copy);
            for(PCommaVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        outAReadComando(node);
    }

    public void inACommaVar(ACommaVar node)
    {
        defaultIn(node);
    }

    public void outACommaVar(ACommaVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaVar(ACommaVar node)
    {
        inACommaVar(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outACommaVar(node);
    }

    public void inANegativoExp1(ANegativoExp1 node)
    {
        defaultIn(node);
    }

    public void outANegativoExp1(ANegativoExp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativoExp1(ANegativoExp1 node)
    {
        inANegativoExp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outANegativoExp1(node);
    }

    public void inAExp1Exp1(AExp1Exp1 node)
    {
        defaultIn(node);
    }

    public void outAExp1Exp1(AExp1Exp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp1Exp1(AExp1Exp1 node)
    {
        inAExp1Exp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAExp1Exp1(node);
    }

    public void inASomaExp2(ASomaExp2 node)
    {
        defaultIn(node);
    }

    public void outASomaExp2(ASomaExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp2(ASomaExp2 node)
    {
        inASomaExp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outASomaExp2(node);
    }

    public void inAExpComparacaoExp2(AExpComparacaoExp2 node)
    {
        defaultIn(node);
    }

    public void outAExpComparacaoExp2(AExpComparacaoExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpComparacaoExp2(AExpComparacaoExp2 node)
    {
        inAExpComparacaoExp2(node);
        if(node.getExpComparacao() != null)
        {
            node.getExpComparacao().apply(this);
        }
        outAExpComparacaoExp2(node);
    }

    public void inAExp2Exp2(AExp2Exp2 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp2(AExp2Exp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp2(AExp2Exp2 node)
    {
        inAExp2Exp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAExp2Exp2(node);
    }

    public void inAComparacaoExpComparacao(AComparacaoExpComparacao node)
    {
        defaultIn(node);
    }

    public void outAComparacaoExpComparacao(AComparacaoExpComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComparacaoExpComparacao(AComparacaoExpComparacao node)
    {
        inAComparacaoExpComparacao(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getComparacao() != null)
        {
            node.getComparacao().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAComparacaoExpComparacao(node);
    }

    public void inAExpLogica1ExpComparacao(AExpLogica1ExpComparacao node)
    {
        defaultIn(node);
    }

    public void outAExpLogica1ExpComparacao(AExpLogica1ExpComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica1ExpComparacao(AExpLogica1ExpComparacao node)
    {
        inAExpLogica1ExpComparacao(node);
        if(node.getExpLogica1() != null)
        {
            node.getExpLogica1().apply(this);
        }
        outAExpLogica1ExpComparacao(node);
    }

    public void inAMaisSoma(AMaisSoma node)
    {
        defaultIn(node);
    }

    public void outAMaisSoma(AMaisSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisSoma(AMaisSoma node)
    {
        inAMaisSoma(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAMaisSoma(node);
    }

    public void inAMenosSoma(AMenosSoma node)
    {
        defaultIn(node);
    }

    public void outAMenosSoma(AMenosSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosSoma(AMenosSoma node)
    {
        inAMenosSoma(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMenosSoma(node);
    }

    public void inAIgualComparacao(AIgualComparacao node)
    {
        defaultIn(node);
    }

    public void outAIgualComparacao(AIgualComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualComparacao(AIgualComparacao node)
    {
        inAIgualComparacao(node);
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        outAIgualComparacao(node);
    }

    public void inADiferenteComparacao(ADiferenteComparacao node)
    {
        defaultIn(node);
    }

    public void outADiferenteComparacao(ADiferenteComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteComparacao(ADiferenteComparacao node)
    {
        inADiferenteComparacao(node);
        if(node.getNotEqual() != null)
        {
            node.getNotEqual().apply(this);
        }
        outADiferenteComparacao(node);
    }

    public void inAMenorIgualComparacao(AMenorIgualComparacao node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualComparacao(AMenorIgualComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualComparacao(AMenorIgualComparacao node)
    {
        inAMenorIgualComparacao(node);
        if(node.getLEqual() != null)
        {
            node.getLEqual().apply(this);
        }
        outAMenorIgualComparacao(node);
    }

    public void inAMaiorIgualComparacao(AMaiorIgualComparacao node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualComparacao(AMaiorIgualComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualComparacao(AMaiorIgualComparacao node)
    {
        inAMaiorIgualComparacao(node);
        if(node.getGEqual() != null)
        {
            node.getGEqual().apply(this);
        }
        outAMaiorIgualComparacao(node);
    }

    public void inAMenorComparacao(AMenorComparacao node)
    {
        defaultIn(node);
    }

    public void outAMenorComparacao(AMenorComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorComparacao(AMenorComparacao node)
    {
        inAMenorComparacao(node);
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        outAMenorComparacao(node);
    }

    public void inAMaiorComparacao(AMaiorComparacao node)
    {
        defaultIn(node);
    }

    public void outAMaiorComparacao(AMaiorComparacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorComparacao(AMaiorComparacao node)
    {
        inAMaiorComparacao(node);
        if(node.getGreater() != null)
        {
            node.getGreater().apply(this);
        }
        outAMaiorComparacao(node);
    }

    public void inAExp2Exp3(AExp2Exp3 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp3(AExp2Exp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp3(AExp2Exp3 node)
    {
        inAExp2Exp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        if(node.getMultDiv() != null)
        {
            node.getMultDiv().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAExp2Exp3(node);
    }

    public void inAExp3Exp3(AExp3Exp3 node)
    {
        defaultIn(node);
    }

    public void outAExp3Exp3(AExp3Exp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp3Exp3(AExp3Exp3 node)
    {
        inAExp3Exp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAExp3Exp3(node);
    }

    public void inAMultMultDiv(AMultMultDiv node)
    {
        defaultIn(node);
    }

    public void outAMultMultDiv(AMultMultDiv node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultMultDiv(AMultMultDiv node)
    {
        inAMultMultDiv(node);
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        outAMultMultDiv(node);
    }

    public void inADivMultDiv(ADivMultDiv node)
    {
        defaultIn(node);
    }

    public void outADivMultDiv(ADivMultDiv node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivMultDiv(ADivMultDiv node)
    {
        inADivMultDiv(node);
        if(node.getBar() != null)
        {
            node.getBar().apply(this);
        }
        outADivMultDiv(node);
    }

    public void inAParentesesExpExp4(AParentesesExpExp4 node)
    {
        defaultIn(node);
    }

    public void outAParentesesExpExp4(AParentesesExpExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParentesesExpExp4(AParentesesExpExp4 node)
    {
        inAParentesesExpExp4(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAParentesesExpExp4(node);
    }

    public void inAValorExp4(AValorExp4 node)
    {
        defaultIn(node);
    }

    public void outAValorExp4(AValorExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp4(AValorExp4 node)
    {
        inAValorExp4(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp4(node);
    }

    public void inAVarExp4(AVarExp4 node)
    {
        defaultIn(node);
    }

    public void outAVarExp4(AVarExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExp4(AVarExp4 node)
    {
        inAVarExp4(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExp4(node);
    }

    public void inAOuExpLogica1(AOuExpLogica1 node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica1(AOuExpLogica1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica1(AOuExpLogica1 node)
    {
        inAOuExpLogica1(node);
        if(node.getExpLogica2() != null)
        {
            node.getExpLogica2().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getExpLogica1() != null)
        {
            node.getExpLogica1().apply(this);
        }
        outAOuExpLogica1(node);
    }

    public void inAXorExpLogica1(AXorExpLogica1 node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica1(AXorExpLogica1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica1(AXorExpLogica1 node)
    {
        inAXorExpLogica1(node);
        if(node.getExpLogica2() != null)
        {
            node.getExpLogica2().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getExpLogica1() != null)
        {
            node.getExpLogica1().apply(this);
        }
        outAXorExpLogica1(node);
    }

    public void inAExpLogica2ExpLogica1(AExpLogica2ExpLogica1 node)
    {
        defaultIn(node);
    }

    public void outAExpLogica2ExpLogica1(AExpLogica2ExpLogica1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica2ExpLogica1(AExpLogica2ExpLogica1 node)
    {
        inAExpLogica2ExpLogica1(node);
        if(node.getExpLogica2() != null)
        {
            node.getExpLogica2().apply(this);
        }
        outAExpLogica2ExpLogica1(node);
    }

    public void inAEExpLogica2(AEExpLogica2 node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica2(AEExpLogica2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica2(AEExpLogica2 node)
    {
        inAEExpLogica2(node);
        if(node.getExpLogica3() != null)
        {
            node.getExpLogica3().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getExpLogica2() != null)
        {
            node.getExpLogica2().apply(this);
        }
        outAEExpLogica2(node);
    }

    public void inAExpLogica3ExpLogica2(AExpLogica3ExpLogica2 node)
    {
        defaultIn(node);
    }

    public void outAExpLogica3ExpLogica2(AExpLogica3ExpLogica2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica3ExpLogica2(AExpLogica3ExpLogica2 node)
    {
        inAExpLogica3ExpLogica2(node);
        if(node.getExpLogica3() != null)
        {
            node.getExpLogica3().apply(this);
        }
        outAExpLogica3ExpLogica2(node);
    }

    public void inANotExpLogica3(ANotExpLogica3 node)
    {
        defaultIn(node);
    }

    public void outANotExpLogica3(ANotExpLogica3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpLogica3(ANotExpLogica3 node)
    {
        inANotExpLogica3(node);
        if(node.getExpComparacao() != null)
        {
            node.getExpComparacao().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outANotExpLogica3(node);
    }

    public void inAExp4ExpLogica3(AExp4ExpLogica3 node)
    {
        defaultIn(node);
    }

    public void outAExp4ExpLogica3(AExp4ExpLogica3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp4ExpLogica3(AExp4ExpLogica3 node)
    {
        inAExp4ExpLogica3(node);
        if(node.getExpComparacao() != null)
        {
            node.getExpComparacao().apply(this);
        }
        outAExp4ExpLogica3(node);
    }
}
