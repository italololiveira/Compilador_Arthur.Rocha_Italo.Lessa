/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
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
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
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
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstDeclaracao(node);
    }

    public void inAOrExpressionExpression(AOrExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAOrExpressionExpression(AOrExpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpressionExpression(AOrExpressionExpression node)
    {
        inAOrExpressionExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAOrExpressionExpression(node);
    }

    public void inAXorExpressionExpression(AXorExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAXorExpressionExpression(AXorExpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpressionExpression(AXorExpressionExpression node)
    {
        inAXorExpressionExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAXorExpressionExpression(node);
    }

    public void inAAndExpressionExpression(AAndExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAAndExpressionExpression(AAndExpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpressionExpression(AAndExpressionExpression node)
    {
        inAAndExpressionExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAAndExpressionExpression(node);
    }

    public void inAEqExpression(AEqExpression node)
    {
        defaultIn(node);
    }

    public void outAEqExpression(AEqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqExpression(AEqExpression node)
    {
        inAEqExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAEqExpression(node);
    }

    public void inANeqExpression(ANeqExpression node)
    {
        defaultIn(node);
    }

    public void outANeqExpression(ANeqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqExpression(ANeqExpression node)
    {
        inANeqExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outANeqExpression(node);
    }

    public void inALtExpression(ALtExpression node)
    {
        defaultIn(node);
    }

    public void outALtExpression(ALtExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtExpression(ALtExpression node)
    {
        inALtExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outALtExpression(node);
    }

    public void inAGtExpression(AGtExpression node)
    {
        defaultIn(node);
    }

    public void outAGtExpression(AGtExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtExpression(AGtExpression node)
    {
        inAGtExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAGtExpression(node);
    }

    public void inALteqExpression(ALteqExpression node)
    {
        defaultIn(node);
    }

    public void outALteqExpression(ALteqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteqExpression(ALteqExpression node)
    {
        inALteqExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outALteqExpression(node);
    }

    public void inAGteqExpression(AGteqExpression node)
    {
        defaultIn(node);
    }

    public void outAGteqExpression(AGteqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteqExpression(AGteqExpression node)
    {
        inAGteqExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAGteqExpression(node);
    }

    public void inAPlusExpression(APlusExpression node)
    {
        defaultIn(node);
    }

    public void outAPlusExpression(APlusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpression(APlusExpression node)
    {
        inAPlusExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAPlusExpression(node);
    }

    public void inAMinusExpression(AMinusExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusExpression(AMinusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpression(AMinusExpression node)
    {
        inAMinusExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMinusExpression(node);
    }

    public void inAStarExpression(AStarExpression node)
    {
        defaultIn(node);
    }

    public void outAStarExpression(AStarExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarExpression(AStarExpression node)
    {
        inAStarExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAStarExpression(node);
    }

    public void inADivExpression(ADivExpression node)
    {
        defaultIn(node);
    }

    public void outADivExpression(ADivExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpression(ADivExpression node)
    {
        inADivExpression(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivExpression(node);
    }

    public void inANegativeExpression(ANegativeExpression node)
    {
        defaultIn(node);
    }

    public void outANegativeExpression(ANegativeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativeExpression(ANegativeExpression node)
    {
        inANegativeExpression(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANegativeExpression(node);
    }

    public void inAComplementExpression(AComplementExpression node)
    {
        defaultIn(node);
    }

    public void outAComplementExpression(AComplementExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComplementExpression(AComplementExpression node)
    {
        inAComplementExpression(node);
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAComplementExpression(node);
    }

    public void inAVarExpression(AVarExpression node)
    {
        defaultIn(node);
    }

    public void outAVarExpression(AVarExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExpression(AVarExpression node)
    {
        inAVarExpression(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExpression(node);
    }

    public void inAValorExpression(AValorExpression node)
    {
        defaultIn(node);
    }

    public void outAValorExpression(AValorExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExpression(AValorExpression node)
    {
        inAValorExpression(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExpression(node);
    }

    public void inAElseStatement(AElseStatement node)
    {
        defaultIn(node);
    }

    public void outAElseStatement(AElseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseStatement(AElseStatement node)
    {
        inAElseStatement(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAElseStatement(node);
    }

    public void inAEvaluateBody(AEvaluateBody node)
    {
        defaultIn(node);
    }

    public void outAEvaluateBody(AEvaluateBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvaluateBody(AEvaluateBody node)
    {
        inAEvaluateBody(node);
        if(node.getCase() != null)
        {
            node.getCase().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEvaluateBody(node);
    }

    public void inAElseEvaluate(AElseEvaluate node)
    {
        defaultIn(node);
    }

    public void outAElseEvaluate(AElseEvaluate node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseEvaluate(AElseEvaluate node)
    {
        inAElseEvaluate(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAElseEvaluate(node);
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
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
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
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outAReadComando(node);
    }

    public void inAWriteComando(AWriteComando node)
    {
        defaultIn(node);
    }

    public void outAWriteComando(AWriteComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteComando(AWriteComando node)
    {
        inAWriteComando(node);
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getExpression());
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        outAWriteComando(node);
    }

    public void inAIfComando(AIfComando node)
    {
        defaultIn(node);
    }

    public void outAIfComando(AIfComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElseStatement() != null)
        {
            node.getElseStatement().apply(this);
        }
        outAIfComando(node);
    }

    public void inAEvaluateComando(AEvaluateComando node)
    {
        defaultIn(node);
    }

    public void outAEvaluateComando(AEvaluateComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvaluateComando(AEvaluateComando node)
    {
        inAEvaluateComando(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            List<PEvaluateBody> copy = new ArrayList<PEvaluateBody>(node.getEvaluateBody());
            for(PEvaluateBody e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PElseEvaluate> copy = new ArrayList<PElseEvaluate>(node.getElseEvaluate());
            for(PElseEvaluate e : copy)
            {
                e.apply(this);
            }
        }
        outAEvaluateComando(node);
    }

    public void inAWhileComando(AWhileComando node)
    {
        defaultIn(node);
    }

    public void outAWhileComando(AWhileComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
        inAWhileComando(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAWhileComando(node);
    }

    public void inARepeatComando(ARepeatComando node)
    {
        defaultIn(node);
    }

    public void outARepeatComando(ARepeatComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepeatComando(ARepeatComando node)
    {
        inARepeatComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outARepeatComando(node);
    }

    public void inAForComando(AForComando node)
    {
        defaultIn(node);
    }

    public void outAForComando(AForComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForComando(AForComando node)
    {
        inAForComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAForComando(node);
    }

    public void inAForStepComando(AForStepComando node)
    {
        defaultIn(node);
    }

    public void outAForStepComando(AForStepComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForStepComando(AForStepComando node)
    {
        inAForStepComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        if(node.getNSteps() != null)
        {
            node.getNSteps().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAForStepComando(node);
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        outAIdArrayVar(node);
    }
}
